import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styles: [`.footer {
    position: fixed;
    bottom: 0px;
    width: 110%;
    height: 5%;
    line-height: 30px; /* Vertically center the text there */
    background-color: #606A75;
    text-align: center;
    color: white;
  }`]
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
