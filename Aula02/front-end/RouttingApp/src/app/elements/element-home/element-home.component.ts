import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-element-home',
  templateUrl: './element-home.component.html',
  styleUrls: ['./element-home.component.scss']
})
export class ElementHomeComponent implements OnInit {

  private data: PADOInterface[] = [
    {
      id: 1,
      title: 'Fechadura Zamac',
      imageUrl: 'assets/img_avatar3.png',
      description: 'Fechadura Zamac Ascot Grafite Polido Externa'
    },
  ]

  constructor() { }

  protected getData(): PADOInterface[]{
    return this.data;
  }

  ngOnInit(): void {
  }


}

interface PADOInterface{
  id: number;
  title: string;
  imageUrl: string;
  description: string;

}