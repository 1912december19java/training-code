import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-services';

  logOutput(output: string) : void {
    console.log(output);
  }

  messages : string[] = ['message 1', 'message B', 'message III', 'new message'];
}
