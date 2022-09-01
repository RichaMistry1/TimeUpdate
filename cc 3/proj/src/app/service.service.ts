import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  private baseUrl = 'http://localhost:8080/finduser';
  private loginUrl = 'http://localhost:8080/saveuser'
  constructor(private http: HttpClient) {}

  getData(input_data: number){
    const justUrl = `${this.baseUrl}/${input_data}`;
    return this.http.get(justUrl);
  }

  saveUser(register_input: number){
    var obj  = {"id": register_input,
    "breakStart":null,
    "endTiming":null,
    "startTiming":null,
    "lunchEnd":null,
    "breakEnd":null,
    "lunchStart":null};

    //console.log(obj);
    return this.http.post(this.loginUrl, obj);
  }

}
