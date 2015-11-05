# _*_ coding:utf-8 _*_

#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      motok
#
# Created:     30/10/2015
# Copyright:   (c) motok 2015
# Licence:     <your licence>
#-------------------------------------------------------------------------------

import sys
from PyQt5.QtWidgets import (QApplication, QWidget, QLabel, QPushButton)

class ClickApp(QWidget):
    count = 0
    def __init__(self):
        super(ClickApp, self).__init__()
        self.initUi()

    def initUi(self):
        self.counter = QLabel('', self)
        self.counter.setGeometry(16,16,160,96)
        self.countup = QPushButton(u'押す', self)
        self.countup.move(16, 60)
        self.countup.clicked.connect(self.doCountup)

    def doCountup(self):
        self.count += 1
        self.counter.setText(str(self.count))

def main():
    app = QApplication(sys.argv)
    clickapp = ClickApp()
    clickapp.show()
    sys.exit(app.exec_())

if __name__ == '__main__':
    main()