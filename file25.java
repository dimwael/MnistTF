->RefactoringNumber->60264<-ExtractSubClass(com.ml.bird;Class_1;[];[barkingPerhaps])
->RefactoringNumber->60266<-ExtractClass(com.ml.bird;Class_2;[];[])
->RefactoringNumber->60267<-PullUpMethod(Class_1;com.ml.bird;[];[barkingPerhaps])
->RefactoringNumber->60268<-PushDownField(com.ml.bird;Class_1;[class_2];[])
->RefactoringNumber->60269<-PushDownMethod(com.ml.bird;Class_1;[];[hungry])
->RefactoringNumber->60271<-ExtractSubClass(com.ml.bird;Class_3;[];[sleeping])
->RefactoringNumber->60273<-PushDownMethod(com.ml.bird;Class_3;[];[barkingPerhaps])
->RefactoringNumber->60275<-PullUpMethod(Class_3;com.ml.bird;[];[barkingPerhaps])
->RefactoringNumber->60276<-PullUpField(Class_1;com.ml.bird;[class_2];[])
->RefactoringNumber->60277<-MoveField(default.Dog;com.ml.bird;[age];[])
<-endRefactoring marker->
package com.ml;

public class bird {
   

   void barkingPerhaps() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}
