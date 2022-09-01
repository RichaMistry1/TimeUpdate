import { Component } from '@angular/core';
import { ServiceService } from '../app/service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private appService: ServiceService) { }

  title = 'proj';

  flag = false;

  input_data = "";
  register_input: string = "";
  register_data:any;
  data : any;

  stringObject: any;

  func1(){
    if(this.input_data != ""){
      var input_d = +this.input_data;
      this.appService.getData(input_d).subscribe((res) => {
        this.data  = res;
        this.stringObject = this.data;
        if(this.data == null){
          this.flag = false;
          alert("No User Id found");
        }else{
          this.flag = true;
        }
      })
    }
  }

  registerUser(){
    
    if(this.register_input != ""){
      var register_int: number = +this.register_input;
      
      this.appService.getData(register_int).subscribe((res) => {
        
        this.register_data = res;
      

      if(this.register_data == null){
        this.appService.saveUser(register_int).subscribe();
        alert("User id created successfully");
      }else{
        alert("User already exists");
      }
    });
    }
  }
}
