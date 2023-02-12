import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BackendService {
  constructor(private http: HttpClient) { }
  path: String = "http://192.168.0.200:8080";

  public getGreeting(name: String | null) {
    if (name == null) {
      return this.http.get(this.path + "/hello")
    }
    return this.http.get(this.path + "/hello?name=" + name);
  }
}