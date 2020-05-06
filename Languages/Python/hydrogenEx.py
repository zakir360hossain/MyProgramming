import numpy as np
import matplotlib.pyplot as plt

pi = np.pi
x = np.linspace(-4 * pi, 4 * pi, 5000)
plt.rcParams.update({'font.size': 20})
plt.rcParams['figure.figsize'] = (12, 5)
plt.axhline(0, color='gray', lw=1)
plt.plot(x, np.sin(x) / x, label=r'$f(x)=\frac{\sin(x)}{x}$')
plt.yticks([0, 1], ['$0$', '$1$'])
plt.xticks(np.arange(-4, 6, 2) * pi,
           ['$-4\pi$', '$-2\pi$', '$0$', '$-2\pi$', '$-4\pi$'])

plt.xlim(-4 * pi, 4 * pi)
plt.ylim(-0.3, 1.1)
plt.legend(loc='best', fontsize=20)
plt.xlabel('$X$')
plt.show()
