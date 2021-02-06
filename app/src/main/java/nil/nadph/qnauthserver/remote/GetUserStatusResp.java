package nil.nadph.qnauthserver.remote;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.io.IOException;

public class GetUserStatusResp extends JceStruct {
    public long uin;//0
    public int blacklistFlags;//1
    public int whitelistFlags;//2

    @Override
    public void writeTo(JceOutputStream os) throws IOException {
        os.write(uin, 0);
        os.write(blacklistFlags, 1);
        os.write(whitelistFlags, 2);
    }

    @Override
    public void readFrom(JceInputStream is) throws IOException {
        uin = is.read(0L,0, true);
        blacklistFlags = is.readInt(1, true);
        whitelistFlags = is.readInt(2, true);
    }
}
