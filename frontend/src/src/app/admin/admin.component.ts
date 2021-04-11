import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {
 
  items: MenuItem[];

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