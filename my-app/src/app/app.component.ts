import {Component, OnInit} from '@angular/core';
import {MyRestService} from "./my-rest.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'My First Angular App';

  constructor(private myRestService: MyRestService) {}

  ngOnInit() {
     this.myRestService.getStatus().subscribe(status => {
       this.title = status.title;
    })
  }


}
