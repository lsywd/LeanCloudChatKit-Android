package cn.leancloud.chatkit.event;

<<<<<<< HEAD
import com.avos.avoscloud.im.v2.AVIMConversation;
import com.avos.avoscloud.im.v2.AVIMMessage;
=======
import cn.leancloud.im.v2.AVIMConversation;
>>>>>>> origin/v5.0.0

/**
 * Created by wli on 16/3/7.
 * 离线消息数量发生变化的事件
 */
public class LCIMOfflineMessageCountChangeEvent {
  public AVIMConversation conversation;
  public AVIMMessage lastMessage;
  private LCIMOfflineMessageCountChangeEvent() {
    ;
  }
  public LCIMOfflineMessageCountChangeEvent(AVIMConversation conversation, AVIMMessage lastMessage) {
    this.conversation = conversation;
    this.lastMessage = lastMessage;
  }
}
