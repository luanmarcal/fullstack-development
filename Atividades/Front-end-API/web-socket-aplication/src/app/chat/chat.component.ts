import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PadolabsChatMessage } from '../models/padolabs-chat-message';
import { SocketService } from '../services/socket.service';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss']
})
export class ChatComponent implements OnInit, OnDestroy {
  

  protected SocketService: SocketService;

  constructor(SocketService: SocketService) {
    this.SocketService = SocketService;
  }

  ngOnInit(): void {
    this.SocketService.OpenConnection();
  }

  ngOnDestroy(): void {
     this.SocketService.CloseConnection();
  }


  public sendMessage(sendForm: NgForm){
      sendForm.value.name;
      const padolabsmessage = new PadolabsChatMessage( sendForm.value.user,  sendForm.value.message );
      this.SocketService.sendMessage(padolabsmessage);
      sendForm.controls['message'].reset();
  }

}
