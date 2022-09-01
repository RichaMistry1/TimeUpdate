import { Component, Input, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ServiceService } from '../service.service';
import { of } from 'rxjs';

@Component({
  selector: 'app-nn',
  templateUrl: './nn.component.html',
  styleUrls: ['./nn.component.css']
})
export class NnComponent implements OnInit {

  private startUrl = 'http://localhost:8080/updatestarttime';
  private endUrl = 'http://localhost:8080/updateendtime';
  private breakStartUrl = 'http://localhost:8080/updatebreakstart';
  private breakEndUrl = 'http://localhost:8080/updatebreakend';
  private lunchStartUrl = 'http://localhost:8080/updatelunchstart';
  private lunchEndUrl = 'http://localhost:8080/updatelunchend';
  

  constructor(private http: HttpClient, private userService: ServiceService) {}

  @Input() stringObject : any;

  ngOnInit(): void {
  }

  onStart(){
    return this.http.put(this.startUrl, this.stringObject).subscribe((res) => {
      this.stringObject = res;
    });
  }

  onEnd(){
    if(this.stringObject.startTiming === null){
      alert("You've start shift First");
      return "";
    }else{
      return this.http.put(this.endUrl, this.stringObject).subscribe((res) => {
        this.stringObject = res;
      });
    }
  }

  onBreakStart(){
    if(this.stringObject.startTiming === null){
      alert("You've to Start Shift");
      return "";
    }else if(this.stringObject.endTiming != null){
      alert("Shift is Ended, You can't take Break");
      return "";
    }else{
      return this.http.put(this.breakStartUrl, this.stringObject).subscribe((res) => {
        this.stringObject = res;
      });
    }
  }

  onBreakEnd(){
    console.log(this.stringObject);
    if(this.stringObject.startTiming === null){
      alert("You've to Start Shift First");
      return "";
    }else if(this.stringObject.endTiming != null){
      alert("Shift is Ended");
      return "";
    }
    else if(this.stringObject.breakStart === null){
      alert("You've to take Break First");
      return "";
    }else{
      return this.http.put(this.breakEndUrl, this.stringObject).subscribe((res) => {
        this.stringObject = res;
      });
    }
    
  }

  onLunchStart(){
    console.log(this.stringObject);
    if(this.stringObject.startTiming === null){
      alert("You've to Start Shift");
      return "";
    }else if(this.stringObject.endTiming != null){
      alert("Shift is Ended, You can't take Lunch Break");
      return "";
    }else{
    return this.http.put(this.lunchStartUrl, this.stringObject).subscribe((res) => {
      this.stringObject = res;
    });
   }
  }

  onLunchEnd(){
    console.log(this.stringObject);
    if(this.stringObject.startTiming === null){
      alert("You've to Start Shift First");
      return "";
    }else if(this.stringObject.endTiming != null){
      alert("Shift is Ended");
      return "";
    }
    else if(this.stringObject.lunchStart === null){
      alert("You've to take Lunch Break First");
      return "";
    }else{
      return this.http.put(this.lunchEndUrl, this.stringObject).subscribe((res) => {
        this.stringObject = res;
      });
    }
    
  }

}
