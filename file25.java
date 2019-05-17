->RefactoringNumber->63660<-MoveField(com.ml.bird;default.tot;[color];[])
->RefactoringNumber->63661<-MoveField(com.ml.Cat;com.ml.bird;[color];[])
->RefactoringNumber->63663<-MoveField(com.ml.bird;default.filej1;[breed];[])
->RefactoringNumber->63665<-ExtractSuperClass(com.ml.bird;Class_2;[color];[barkingPerhaps4])
->RefactoringNumber->63666<-ExtractSuperClass(com.ml.bird;Class_3;[age];[hungry4])
->RefactoringNumber->63667<-PushDownMethod(Class_3;com.ml.bird;[];[hungry4])
->RefactoringNumber->63668<-ExtractSubClass(com.ml.bird;Class_4;[];[barkingPer])
->RefactoringNumber->63669<-PullUpField(com.ml.bird;Class_3;[filej1];[])
->RefactoringNumber->63670<-ExtractClass(com.ml.bird;Class_5;[];[sleeping4])
->RefactoringNumber->63672<-ExtractSubClass(com.ml.bird;Class_6;[];[hungry4])
<-endRefactoring marker->
package com.ml;

public class bird {
   String breed;
   int age;
   String color;

   void barkingPerhaps() {
   }
   void barkingPer() {
   }
   void hungry() {
   }

   void sleeping() {
   }
}
