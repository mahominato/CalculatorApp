# Calculator App

## Description
This is a simple calculator application developed in Java using JavaFX. The application allows users to perform basic mathematical operations: addition, subtraction, multiplication, and division.

## Installation
To run the application, you will need:
- JDK 23
- JavaFX 23

### Installation Steps:
1. Ensure that JDK 23 and JavaFX 23 are installed and configured.
2. Clone the repository:
   ```bash
   git clone https://github.com/mahominato/CalculatorApp.git
3. Navigate to the project directory:
   ```bash
   cd CalculatorApp
4. Build the project in your IDE (e.g., IntelliJ IDEA) and run it.

## How to Use the Calculator
   1. Open the application.
   2. Enter numbers and select an operation.
   3. Click the equals button (=) to get the result.
   4. The result will be displayed on the screen.
## Main Interface
![img](https://github.com/user-attachments/assets/20ba20a4-9537-4990-afaf-02398bd076a9)

## Example Input/Result
![img_1](https://github.com/user-attachments/assets/e6abac33-8f3b-4880-bf85-6381688f0255)

![img_2](https://github.com/user-attachments/assets/6e405252-44f1-48ac-9701-10f8e2fca0b4)
![img_3](https://github.com/user-attachments/assets/9d63a106-1569-40c6-9356-56ef2d369a62)
## Division By Zero
![img_4](https://github.com/user-attachments/assets/58a7f951-ab0a-44e5-9a08-668d64d1e43c)
![img_5](https://github.com/user-attachments/assets/6f512cf2-a743-418a-859d-ea962922cfaf)
![img_6](https://github.com/user-attachments/assets/3f2ebc5e-127d-461a-85e6-68c04aa54430)



## Special Instructions
1. **Dependencies**: Make sure all necessary dependencies are installed. This project uses JavaFX, so you need to have the correct version of Java and JavaFX configured. Refer to the `pom.xml` (if using Maven) or your build configuration.
2. **NullPointerException**: If the application throws a "NullPointerException," it is likely that some UI elements are not correctly linked to their controller in the FXML file. Double-check that all `fx:id` attributes in your FXML file match the controller's fields.

## Known Issues
1. **Non-numeric Input**: The application currently does not handle non-numeric inputs. Ensure that all entered values are valid numbers to avoid unexpected behavior.
2. **Division by Zero**: If the user attempts to divide by zero, an error message is displayed instead of the result.
