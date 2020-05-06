import logging

logger = logging.getLogger(__name__)
logger.setLevel(logging.INFO)

formatter = logging.Formatter('%(asctime)s:%(levelname)s:%(name)s:%(message)s')

file_handler = logging.FileHandler('employee.log')
file_handler.setFormatter(formatter)

logger.addHandler(file_handler)


# If not created one's own logger:
# logging.basicConfig(filename='employee.log', level=logging.INFO, format='%(asctime)s:%(levelname)s:
# %(name)s:%(message)s')


class Employee:
    """A sample class Employee"""

    def __init__(self, fn, ln):
        self.fn = fn
        self.ln = ln
        logger.info('Employee created: {} - {}'.format(self.fullname, self.email))

    @property
    def email(self):
        return '{}.{}@gmail.com'.format(self.fn, self.ln)

    @property
    def fullname(self):
        return '{} {}'.format(self.fn, self.ln)


employee1 = Employee('John', 'Smith')
employee2 = Employee('William', 'Hershel')
employee13 = Employee('Morgan', 'Freeman')
