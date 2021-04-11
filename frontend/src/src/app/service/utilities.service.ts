import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { MessageService } from 'primeng/api';


@Injectable({
  providedIn: 'root'
})
export class UtilitiesService {

  public createUpdateMessage: string;

  constructor(
    private messageService: MessageService,
    private router: Router
  ) { }

  toastMsg() {
    this.messageService.clear();
    if (this.createUpdateMessage) {
      this.messageService.add({
        severity: 'success',
        summary: 'Success',
        detail: this.createUpdateMessage,
        life: 5000,
        key: 'gt'
      });
      this.createUpdateMessage = undefined;
    }
  }

  handleSuccessResposnse(successMessage: string, navigationLink: string) {
   this.createUpdateMessage = successMessage;
    this.router.navigate([navigationLink]);
  }

  handleErrorResposnse(error) {
    this.messageService.clear();
    this.messageService.add({
      severity: 'error',
      summary: 'Error',
      detail: error ? error : 'A server error has occured',
      life: 5000,
      key: 'gt'
    })
  }

  createUpdateInProgress(action: string, message: string) {
    this.messageService.clear();
    this.messageService.add({
      severity: 'info',
      summary: action,
      detail: message,
      life: 1000000,
      key: 'gt'
    });
  }



}
