/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjff;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprwoh;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryffa;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;

public class sprkik
extends spryye {
    private BigInteger cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private static final sprjff cfr_renamed_4;

    private /* synthetic */ BigInteger cfr_renamed_9978(BigInteger arg0, boolean arg1) {
        int n;
        if (arg1) {
            cfr_renamed_4.cfr_renamed_1859(arg0);
            return arg0;
        }
        if ((arg0.intValue() & 1) == 0) {
            throw new IllegalArgumentException(spryffa.cfr_renamed_9("/E<6\u0010y\u0019c\u0011c\u000e6\u0014e]s\u000bs\u0013"));
        }
        if (sprjcf.cfr_renamed_5159(sprqxe.cfr_renamed_9("\b \u0006a\u0018?\u0002=\u000ea\u001b<\u0006 \u000f*\u0007a\u0018*\b:\u0019&\u001f6E=\u0018.E.\u0007#\u000484:\u0005<\n)\u000e\u0010\u0006 \u000f"))) {
            return arg0;
        }
        int n2 = sprjcf.cfr_renamed_5152(spryffa.cfr_renamed_9("\u001ey\u00108\u000ef\u0014d\u00188\re\u0010y\u0019s\u00118\u000es\u001ec\u000f\u007f\toSd\u000ewS{\u001cn\"e\u0014l\u0018"), 15360);
        if (n2 < (n = arg0.bitLength())) {
            throw new IllegalArgumentException(sprqxe.cfr_renamed_9("\"\u0004+\u001e#\u001e<K9\n#\u001e*K \u001e;K \ro\u0019.\u0005(\u000e"));
        }
        if (!arg0.gcd(cfr_renamed_3).equals(cfr_renamed_1)) {
            throw new IllegalArgumentException(spryffa.cfr_renamed_9("D.W]{\u0012r\bz\be]~\u001ce]w]e\u0010w\u0011z]f\u000f\u007f\u0010s]p\u001cu\ty\u000f"));
        }
        int n3 = arg0.bitLength() / 2;
        int n4 = sprjcf.cfr_renamed_5152(sprqxe.cfr_renamed_9("\b \u0006a\u0018?\u0002=\u000ea\u001b<\u0006 \u000f*\u0007a\u0018*\b:\u0019&\u001f6E=\u0018.E\"\n74\"\u0019\u0010\u001f*\u0018;\u0018"), n = n3 >= 1536 ? 3 : (n3 >= 1024 ? 4 : (n3 >= 512 ? 7 : 50)));
        if (n4 > 0 && !sprwoh.cfr_renamed_7257(arg0, sprybl.cfr_renamed_2794(), n4).cfr_renamed_7258()) {
            throw new IllegalArgumentException(spryffa.cfr_renamed_9("D.W]{\u0012r\bz\be]\u007f\u000e6\u0013y\t6\u001ey\u0010f\u0012e\u0014b\u0018"));
        }
        cfr_renamed_4.cfr_renamed_1859(arg0);
        return arg0;
    }

    public sprkik(boolean arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, false);
    }

    public BigInteger cfr_renamed_360() {
        return this.cfr_renamed_0;
    }

    static {
        cfr_renamed_4 = new sprjff();
        cfr_renamed_3 = new BigInteger(sprqxe.cfr_renamed_9("S~Xw\u000ew\n\u007f\r,\r|\n{\u000ew_.\\xZ+_\u007f\r+X\u007f^+\\)_.\nzR|[y\u000fxYzZ+\u000ez_+Rw\n)S)\u000ev^xYv\n~\rxX+SvX)\n{Y{\b+Y*\u000f,SyXy\ny\b|Yw^*[}Y-[*Xw]y\nz]z\n*S~[w\u000e*\u000fw^vZ,\u000f{\r*S+Y,\u000ew]~]z\nv\\w\u000fxZv\u000e-\ry_x\r|]}\u000f|X)\b.Yv\b+ZxR)\t{Y{[~\b-\n)X+\r\u007f\byZ{[z])R,S)X,\r+^~\u000e{\\{\n)\ty\t,]v\\{\rxS+\tw\n-\nw\u000ev\u000ezZx\r+\u000e+]zSzR~\n-\\z[}\t+_~S{R{]}\r"), 16);
        cfr_renamed_1 = BigInteger.valueOf(1L);
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_2;
    }

    public sprkik(boolean arg0, BigInteger arg1, BigInteger arg2, boolean arg3) {
        boolean bl = arg0;
        super(bl);
        if (!bl && (arg2.intValue() & 1) == 0) {
            throw new IllegalArgumentException(spryffa.cfr_renamed_9("D.W]f\bt\u0011\u007f\u001eS\u0005f\u0012x\u0018x\t6\u0014e]s\u000bs\u0013"));
        }
        this.cfr_renamed_2 = cfr_renamed_4.cfr_renamed_7261(arg1) ? arg1 : this.cfr_renamed_9978(arg1, arg3);
        this.cfr_renamed_0 = arg2;
    }
}

