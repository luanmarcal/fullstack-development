import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private title: string = 'MyFirstApp';
  private data: PADOInterface[] = [
    {
      id: 0,
      title: "PADO NEWS",
      imageUrl: 'assets/05.png'
    },

    {
      id: 1,
      title: "PADO NEWS",
      imageUrl: 'assets/05.png'
    },

    {
      id: 2,
      title: "PADO NEWS",
      imageUrl: 'assets/05.png'
    }
  ]

  constructor(){}

  //getters and setters
  protected getTitle()
  {
    return this.title;
  }

  protected setTitle(event: any)
  {
    console.log(event.target.value)
    this.title = event.target.value
  }

  protected getData() : PADOInterface[]
  {
    return this.data;
  }
}

//Interfaces
interface PADOInterface{
  title: string;
  imageUrl: string;
  id: number;
}


