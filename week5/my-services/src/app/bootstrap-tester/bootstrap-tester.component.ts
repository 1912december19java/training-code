import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bootstrap-tester',
  templateUrl: './bootstrap-tester.component.html',
  styleUrls: ['./bootstrap-tester.component.css']
})
export class BootstrapTesterComponent implements OnInit {

  classesToTest : string = "btn btn-danger";

  constructor() { }

  ngOnInit() {
  }

}
