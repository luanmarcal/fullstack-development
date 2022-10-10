import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

  @Input() title = "Test card";
  @Input() id = 0
  @Input() imageUrl = "dsa"
  @Input() description = "das"

  constructor() { }

  ngOnInit(): void {
  }

}

// link aq