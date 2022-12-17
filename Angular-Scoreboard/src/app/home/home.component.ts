import { Component } from '@angular/core';
import { BackendService } from '../backend.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent {
  constructor(private backend: BackendService) {
    this.message = "greeting failed";
    this.backend.getGreeting(null).subscribe((out: any) => {
      this.message = out.content;
    })
  }
  message: String;
}
