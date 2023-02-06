// Variable can be tested for equality among different values

// syntax:

switch (variable){
  case 1:
  System.out.println("case 1");
  break;
  
  case 2:
  System.out.println("case 2");
  break;
  
}

//Example

String fruit = "watermelon";

swtich(fruit){
  case "apple":
    System.out.println("The fruit was a watermelon");
    break;
  case "peach":
    System.out.println("The fruit was a peach");
    break;
  case "watermelon":
    System.out.println("The fruit was a watermelon");
    break;
}

//Example

int switchValue = 4;

switch(switchValue){
  case 1: 
     System.out.println("The value was 1");
     break;
  case 2:
    System.out.println("The value was 2");
    break;
  case 3: case 4: case 5: 
    System.out.println("The value was " + switchValue);
    break;
  default:
    System.out.println("The value was neither a 1,2,3,4,5");
    break;
}
