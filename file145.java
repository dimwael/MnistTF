->RefactoringNumber->53825<-EncapsulateField(com.ml.Dog;;[age];[])
->RefactoringNumber->53826<-EncapsulateField(com.ml.Dog;;[id];[])
->RefactoringNumber->53828<-ExtractSubClass(com.ml.Dog;Class_1;[age|breed];[barking])
->RefactoringNumber->53829<-PullUpMethod(Class_1;com.ml.Dog;[];[getAge])
->RefactoringNumber->53830<-ExtractSubClass(com.ml.Dog;Class_2;[age];[hungry])
->RefactoringNumber->53832<-IncreaseMethodSecurity(com.ml.Dog;;[];[getColor])
->RefactoringNumber->53834<-PushDownField(com.ml.Dog;Class_2;[color];[])
->RefactoringNumber->53836<-ExtractSubClass(com.ml.Dog;Class_4;[id];[])
<-endRefactoring marker->
package com.ml;

public class Dog {
   
   String breed;
   int age;
   int id ;
   String color;
   
   public void getAge()
   {return age;}
   
   public void getColor()
   {return color;}
   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}
