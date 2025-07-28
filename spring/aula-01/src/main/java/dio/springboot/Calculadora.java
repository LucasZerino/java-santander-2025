package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

        public int somar(int number1, int number2){
            return number1 + number2;
        }

}
