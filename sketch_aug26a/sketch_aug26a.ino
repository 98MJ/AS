#include <SoftwareSerial.h>
char c, test;

void setup(){
  Serial.begin(9600);
  Serial1.begin(9600); //아두이노 - 팅커보드 18, 19
  Serial2.begin(9600); //아두이노 - 핸드폰(레시피 서버) 16, 17
 // Serial3.begin(9600); //아두이노 - 핸드폰(마트 서버) 14, 15
}
 
void loop(){

  if (Serial.available()){
    test=Serial.read();
    Serial.write(test);
    Serial1.write(test);
    Serial2.write(test);
    //Serial3.write(test);
    }  
  if (Serial1.available()) { //팅커보드쪽에서 정보가 들어오면 J1
    Serial2.write(Serial1.read()); //팅커보드에서 넘어온 요리 메뉴 이름을 레시피 서버로 전송
     Serial.write(Serial1.read());
    
  }
  if (Serial2.available()) { //핸드폰(레시피 서버)에서 정보가 들어오면 HC-06
     Serial1.write(Serial2.read());  //pc쪽 시리얼 모니터에 표시
     
    // Serial3.write(Serial2.read());  //마트 서버 쪽으로 레시피 전달
  }

//  if (Serial3.available()) { //핸드폰(마트 서버)에서 정보가 들어오면 ???
//     Serial1.write(Serial3.read());  //pc쪽 시리얼 모니터에 표시
//    
//  }
  
//  if (Serial.available()) {
//    c=Serial.read();
//    Serial1.write(c);
//    Serial2.write(c);
//  }
}
