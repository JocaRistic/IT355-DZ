import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Superhero } from '../models/superhero';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SuperheroService {

  private baseUrl = 'http://localhost:8080/superhero';

  constructor(private _http : HttpClient) { }

  public getSuperheroes(): Observable<Superhero[]>{
    return this._http.get<Superhero[]>(this.baseUrl);
  }

  public getSuperheroById(id?: number): Observable<Superhero>{
    return this._http.get<Superhero>(this.baseUrl + '/' + id);
  }

  public addSuperhero(superhero: Superhero): Observable<Superhero>{
    return this._http.post<Superhero>(this.baseUrl, superhero);
  }

  public updateSuperhero(superhero: Superhero): Observable<Superhero>{
    return this._http.put<Superhero>(this.baseUrl, superhero);
  }

  public deleteSuperheroById(id?: number): Observable<Superhero>{
    return this._http.delete<Superhero>(this.baseUrl + '/' + id);
  }

}
