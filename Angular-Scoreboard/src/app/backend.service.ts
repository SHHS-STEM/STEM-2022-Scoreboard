import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BackendService {
  constructor(private http: HttpClient) { }
  path: String = "http://localhost:8080";

  public getGreeting(name: String | null) {
    if (name == null) {
      return this.http.get(this.path + "/hello")
    }
    return this.http.get(this.path + "/hello?name=" + name);
  }
}