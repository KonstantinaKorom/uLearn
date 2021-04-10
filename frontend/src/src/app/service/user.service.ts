import { environment } from '../../environments/environment';
import { User } from '../models/user';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Injectable()
export class UserService {
    private environment = environment;

    
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(this.environment.users);
    }

    getById(id: string) {
        return this.http.get(this.environment.users + id);
    }

    create(user: User) {
        return this.http.post(this.environment.users, user);
    }

    update(user: User) {
        return this.http.put(this.environment.users + user.id, user);
    }

    delete(id: string) {
        return this.http.delete(this.environment.users + id);
    }
}