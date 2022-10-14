import { Injectable } from '@angular/core';
import { PadolabsChatMessage } from '../models/padolabs-chat-message';

@Injectable({
  providedIn: 'root'
})
export class SocketService {


  private PadoLabsChatMessages: PadolabsChatMessage[] = [];
  private socket: WebSocket | undefined;

  constructor() {
  }

  public getMessages(): PadolabsChatMessage[] {
    return this.PadoLabsChatMessages;
  }

  public OpenConnection() {

    this.socket = new WebSocket("ws://172.16.107.45:7000/chat/luan");

    this.socket.onopen = (event) => {
      console.log(event)
    }

    this.socket.onmessage = (event) => {
      console.log(event.data)
      const padoMessage = JSON.parse(event.data)
      this.PadoLabsChatMessages.push(padoMessage)
    }

    this.socket.onclose = (event) => {
      console.log(event)
    }


  }

  public sendMessage(padolabsMessage: PadolabsChatMessage) {
    this.socket?.send(JSON.stringify(padolabsMessage));

  }

  public CloseConnection() {
    this.socket?.close();
  }
}
