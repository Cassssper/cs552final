/*
 * @Author: Jin X
 * @Date: 2020-12-11 22:14:21
 * @LastEditTime: 2020-12-11 22:46:43
 */

package edu.rutgers.cs552.im.client.handler;

import edu.rutgers.cs552.im.client.websocket.WebSocketInterface;


import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@ChannelHandler.Sharable
public class NettyToFrontEndHandler extends ChannelInboundHandlerAdapter {

    
    @Autowired    
    private WebSocketInterface webSocketInterface;

    @Override
    public void channelRead(ChannelHandlerContext ctx, String msg){
        
        webSocketInterface.sendMessage(msg);
    }
}