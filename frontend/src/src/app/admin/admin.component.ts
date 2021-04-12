import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
// import { ViewChild, ElementRef  } from '@angular/core';
// import { HttpEventType, HttpErrorResponse } from '@angular/common/http';
// import { of } from 'rxjs';  
// import { catchError, map } from 'rxjs/operators';  
// import { UploadService } from '../service/upload.service';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {
 
  items: MenuItem[];

//   @ViewChild("fileUpload", {static: false}) fileUpload: ElementRef;files  = [];  
//   constructor(private uploadService: UploadService) { }
  

//   uploadFile(file) {  
//     const formData = new FormData();  
//     formData.append('file', file.data);  
//     file.inProgress = true;
    
//     this.uploadService.upload(formData).pipe(  
//       map(event => {
//           switch (event.type) {  
//           case HttpEventType.UploadProgress:  
//             file.progress = Math.round(event.loaded * 100 / event.total);  
//             break;  
//           case HttpEventType.Response:  
//             return event;  
//         }  
//       }),  
//       catchError((error: HttpErrorResponse) => {  
//         file.inProgress = false;  
//         return of(`${file.data.name} upload failed.`);  
//       })).subscribe((event: any) => {  
//         if (typeof (event) === 'object') {  
//           console.log(event.body);  
//         }  
//       });  
//   }

//   private uploadFiles() {  
//     this.fileUpload.nativeElement.value = '';  
//     this.files.forEach(file => {  
//       this.uploadFile(file);  
//     });  
// }

//   onClick() {  
//     const fileUpload = this.fileUpload.nativeElement;fileUpload.onchange = () => {  
//     for (let index = 0; index < fileUpload.files.length; index++)  
//     {  
//      const file = fileUpload.files[index];  
//      this.files.push({ data: file, inProgress: false, progress: 0});  
//     }  
//       this.uploadFiles();  
//     };  
//     fileUpload.click();  
// }

  ngOnInit() {
      this.items = [
          {
              label: 'Books',
              items: [{
                      label: 'New', 
                      icon: 'pi pi-fw pi-plus',
                      
                  },
                  {label: 'View All'},
                  {label: 'Delete'}
              ]
          },
          {
            label: 'Videos',
            items: [{
                    label: 'New', 
                    icon: 'pi pi-fw pi-plus',
                    items: [
                        {label: 'Book'},
                        {label: 'Video'},
                    ]
                },
                {label: 'View All'},
                {label: 'Delete'}
            ]
        },
          {
            label: 'Users',
            items: [{
                    label: 'New', 
                    icon: 'pi pi-fw pi-plus',
                    items: [
                        {label: 'Book'},
                        {label: 'Video'},
                    ]
                },
                {label: 'Open'},
                {label: 'Quit'}
            ]
        }
      ];
  }
}