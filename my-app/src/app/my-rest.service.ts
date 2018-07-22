import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {MyMessage} from "./mymessage";
import {Observable} from "rxjs/index";

@Injectable()
export class MyRestService {
  constructor(private http:HttpClient) {

  }

  url = "http://localhost:8080/UNOGame-1.0-SNAPSHOT/api/uno";

  getStatus() : Observable<MyMessage>{
    return this.http.get<MyMessage>(this.url);
  }

}
