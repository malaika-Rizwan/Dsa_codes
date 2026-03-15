package binearysearchtree;


class StudentNode {
 String name;
 double cgpa;
 StudentNode left, right;

 StudentNode(String name, double cgpa) {
     this.name = name;
     this.cgpa = cgpa;
     left = right = null;
 }
}