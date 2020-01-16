# All imports
import speech_recognition as sr
import webbrowser
import time
import random
import os
import playsound
from gtts import gTTS

recognizer = sr.Recognizer()


def record_audio(ask=None):
    with sr.Microphone() as source:
        if ask is not None:
            alexa(ask)
        audio = recognizer.listen(source)
        voice_data = ''
        try:
            voice_data = recognizer.recognize_google(audio)
        except sr.UnknownValueError:
            alexa("Sorry! I didn't get that")
        except sr.RequestError:
            alexa("Sorry! my speech service is down")
        return voice_data


def alexa(audio_string):
    """The"""
    tts = gTTS(text=audio_string, lang='en')
    r = random.randint(1, 10000000)
    audio_file = 'audio-' + str(r) + '.mp3'
    tts.save(audio_file)
    playsound.playsound(audio_file)
    print(audio_string)
    os.remove(audio_file)

def respond(voice_data):
    if 'what is your name' in voice_data:
        alexa('My name is Alexa')
    if 'what time is it' in voice_data:
        return
        current_time = "it's " + time.ctime()
        alexa(current_time)
    if 'search' in voice_data:
        search = record_audio("What do you want to search for?")
        url = 'https://google.com/search?q=' + search
        webbrowser.get().open(url)
        alexa("Sure " + search)
    if 'find location' in voice_data:
        location = record_audio('What location?')
        url = 'https://google.nl/maps/place/' + location + '/&amp;'
        webbrowser.get().open(url)
        alexa("Sure " + location)
    if 'exit' in voice_data:
        alexa("OK")
        exit()

time.sleep(1)
alexa("How can I help you")
while 1:
    # voice_data2 is same as voice_data because the function record_audio returns 'voice_data.'
    voice_data2 = record_audio()
    respond(voice_data2)