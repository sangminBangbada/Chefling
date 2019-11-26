'''
Scheduler Architecture
Struct Scheduler Architecture
'''

from Scheduling_Setup import *
from abc import *


#TODO  : Food class
class Food(metaclass = ABCMeta) :
    def __init__(self,orderID, cate, name, course):
        self.orderID = orderID
        self.cate = cate
        self.name = name
        self.course = course

        self.priority = 1
        self.waitable = 0
        self.realwait = 0
        self.andthen = 0

        self.emergency = 0

        self.foodID = 0

        self.cook = ""


#TODO : Cook class
class Cook(metaclass = ABCMeta) :
    def __init__(self, cook_id, position, ability):
        self.cook_id = cook_id
        self.position = position
        self.ability = ability

        self.charge = []

        self.cookClock = 0

        self.sema = False

    def Block(self, event):
        if event == True :
            self.sema = 0
