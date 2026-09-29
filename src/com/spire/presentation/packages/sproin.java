/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprknn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqn;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.sprvdaa;
import com.spire.presentation.packages.sprvtb;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwqn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sproin
extends spryjn {
    private sprwqn cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14054(String string, String[] stringArray) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835((String)arg0);
        sproin2.cfr_renamed_14055();
        sproin2.cfr_renamed_14056(stringArray);
    }

    @Override
    public void cfr_renamed_14057(String arg0, String arg1) {
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835(arg0);
        sproin2.cfr_renamed_14055();
        this.cfr_renamed_11835(arg1);
    }

    @Override
    public void cfr_renamed_14058(String arg0) {
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835(arg0);
        sproin2.cfr_renamed_14055();
    }

    @Override
    public void cfr_renamed_14059(String arg0, String arg1, String arg2) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg1;
        objectArray[1] = arg2;
        this.cfr_renamed_11735(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    @Override
    public void cfr_renamed_11594(byte arg0) {
        this.cfr_renamed_14060().cfr_renamed_11594(arg0);
    }

    @Override
    public void cfr_renamed_14061() {
        this.cfr_renamed_11835(sprvdaa.cfr_renamed_9("g\t"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14062(int[] nArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_11835(sprebp.cfr_renamed_14063((int)arg0[n3]));
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    @sprtea
    public void cfr_renamed_14064(sprxln arg0) {
        this.cfr_renamed_6493().cfr_renamed_14065(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14066(sprqgp sprqgp2) {
        void arg0;
        sproin sproin2 = this;
        sproin sproin3 = this;
        void v2 = arg0;
        sproin sproin4 = this;
        sproin sproin5 = this;
        sproin5.cfr_renamed_14067(arg0.cfr_renamed_12595());
        sproin5.cfr_renamed_14055();
        sproin5.cfr_renamed_14067(arg0.cfr_renamed_12596());
        sproin4.cfr_renamed_14055();
        sproin4.cfr_renamed_14067(arg0.cfr_renamed_12597());
        sproin4.cfr_renamed_14055();
        sproin3.cfr_renamed_14067(v2.cfr_renamed_12598());
        sproin3.cfr_renamed_14055();
        sproin2.cfr_renamed_14067(v2.cfr_renamed_12599());
        sproin2.cfr_renamed_14055();
        sproin2.cfr_renamed_14067(sprqgp2.cfr_renamed_12600());
    }

    @sprtea
    public void cfr_renamed_14068(String arg0) {
        this.cfr_renamed_11835("(");
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = sprxsp.cfr_renamed_12396((Integer)iterator.next());
            this.cfr_renamed_14069(string2.charAt(0));
            if (string2.length() <= 1) continue;
            this.cfr_renamed_14069(string.charAt(1));
        }
        this.cfr_renamed_11835(")");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14070(int n) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_14071((byte)(arg0 >> 8));
        sproin2.cfr_renamed_14071((byte)n);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14072(String string, sprqgp sprqgp2) {
        void arg1;
        void arg0;
        sproin sproin2 = this;
        sproin sproin3 = this;
        sproin3.cfr_renamed_11835((String)arg0);
        sproin3.cfr_renamed_14055();
        sproin3.cfr_renamed_11835("[");
        sproin2.cfr_renamed_14066((sprqgp)arg1);
        sproin2.cfr_renamed_11835("]");
    }

    @Override
    public void cfr_renamed_14073(String arg0, boolean arg1) {
        this.cfr_renamed_14057(arg0, sproin.cfr_renamed_14074(arg1));
    }

    private /* synthetic */ void cfr_renamed_14069(int arg0) {
        if (arg0 <= 255) {
            this.cfr_renamed_11594((byte)0);
            if (arg0 == 40 || arg0 == 41 || arg0 == 92) {
                this.cfr_renamed_11594((byte)92);
            }
            this.cfr_renamed_11594((byte)arg0);
            return;
        }
        this.cfr_renamed_14070(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14075(String string, int[] nArray) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835((String)arg0);
        sproin2.cfr_renamed_14055();
        sproin2.cfr_renamed_14062(nArray);
    }

    @Override
    public void cfr_renamed_14076() {
        this.cfr_renamed_11835("\r\n");
    }

    @Override
    public void cfr_renamed_14077(String arg0, float arg1) {
        this.cfr_renamed_14057(arg0, sproin.cfr_renamed_14078(arg1));
    }

    private /* synthetic */ sprwqn cfr_renamed_6493() {
        if (this.cfr_renamed_4 == null) {
            sproin sproin2 = this;
            this.cfr_renamed_4 = new sprwqn(this);
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14079(sprqgp sprqgp2) {
        void arg0;
        sproin sproin2 = this;
        sproin sproin3 = this;
        sproin3.cfr_renamed_11835("[");
        sproin3.cfr_renamed_14066((sprqgp)arg0);
        sproin2.cfr_renamed_14058("]");
        sproin2.cfr_renamed_11735(sprvtb.cfr_renamed_9("Y&T*[="));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14080(String string, boolean[] blArray) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835((String)arg0);
        sproin2.cfr_renamed_14055();
        sproin2.cfr_renamed_14081(blArray);
    }

    @sprtea
    public void cfr_renamed_14082(byte[] arg0, spruao arg1, String arg2) {
        sproin sproin2;
        String[] stringArray = null;
        String[] stringArray2 = null;
        if (arg1 == null) {
            String[] stringArray3 = new String[1];
            stringArray3[0] = "/ASCII85Decode";
            stringArray = stringArray3;
            sproin2 = this;
        } else {
            String[] stringArray4 = new String[2];
            stringArray4[0] = "/ASCII85Decode";
            stringArray4[1] = arg1.cfr_renamed_14083();
            stringArray = stringArray4;
            String string = arg1.cfr_renamed_14084();
            if (sprznp.cfr_renamed_12328(string)) {
                String[] stringArray5 = new String[2];
                stringArray5[0] = "null";
                stringArray5[1] = string;
                stringArray2 = stringArray5;
            }
            sproin2 = this;
        }
        sproin2.cfr_renamed_14085(sprvdaa.cfr_renamed_9("vLiJ"), arg2);
        sproin sproin3 = this;
        sproin3.cfr_renamed_11735(sprvtb.cfr_renamed_9("*O;H,T=\\ V,"));
        sproin3.cfr_renamed_14086();
        sproin3.cfr_renamed_14054("/Filter", stringArray);
        if (stringArray2 != null && stringArray2.length > 0) {
            this.cfr_renamed_14054("/DecodeParms", stringArray2);
        }
        sproin sproin4 = this;
        sproin sproin5 = this;
        sproin5.cfr_renamed_14061();
        sproin5.cfr_renamed_14058("/ReusableStreamDecode");
        sproin4.cfr_renamed_11735("filter");
        sproin4.cfr_renamed_11735(sprknn.cfr_renamed_14087(arg0, false, true));
        this.cfr_renamed_11735("def");
    }

    private static /* synthetic */ String cfr_renamed_14074(boolean arg0) {
        if (arg0) {
            return "true";
        }
        return "false";
    }

    @sprtea
    public static String cfr_renamed_14088(sprwbp arg0) {
        Object[] objectArray = new Object[3];
        objectArray[0] = sproin.cfr_renamed_14078((float)arg0.cfr_renamed_3353() / 255.0f);
        objectArray[1] = sproin.cfr_renamed_14078((float)arg0.cfr_renamed_1145() / 255.0f);
        objectArray[2] = sproin.cfr_renamed_14078((float)arg0.cfr_renamed_1997() / 255.0f);
        return sprraia.cfr_renamed_11562(sprvdaa.cfr_renamed_9("LiJyLhJyLkJ"), objectArray);
    }

    @Override
    public void cfr_renamed_14086() {
        this.cfr_renamed_11835(sprvtb.cfr_renamed_9("\u0006u"));
    }

    @Override
    public void cfr_renamed_11735(String arg0) {
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835(arg0);
        sproin2.cfr_renamed_14076();
    }

    @Override
    public void cfr_renamed_14085(String arg0, String arg1) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg1;
        this.cfr_renamed_11735(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14089(String string, sprgeja sprgeja2) {
        void arg0;
        void arg1;
        sproin sproin2 = this;
        sproin sproin3 = this;
        void v2 = arg1;
        sproin sproin4 = this;
        sproin sproin5 = this;
        sproin sproin6 = this;
        sproin6.cfr_renamed_11835((String)arg0);
        sproin6.cfr_renamed_14055();
        sproin5.cfr_renamed_11835("[");
        sproin5.cfr_renamed_14067(arg1.cfr_renamed_13430());
        sproin4.cfr_renamed_14055();
        sproin4.cfr_renamed_14067(arg1.cfr_renamed_13342());
        sproin4.cfr_renamed_14055();
        sproin3.cfr_renamed_14067(v2.cfr_renamed_13341());
        sproin3.cfr_renamed_14055();
        sproin2.cfr_renamed_14067(v2.cfr_renamed_13429());
        sproin2.cfr_renamed_11835("]");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14081(boolean[] blArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_11835(sproin.cfr_renamed_14074((boolean)arg0[n3]));
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    @sprtea
    public void cfr_renamed_14090(sprtqn arg0) {
        this.cfr_renamed_6493().cfr_renamed_14091(arg0);
    }

    @sprtea
    public sproin(spreen arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14092(String string, float[] fArray) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_11835((String)arg0);
        sproin2.cfr_renamed_14055();
        sproin2.cfr_renamed_14093(fArray);
    }

    @Override
    public void cfr_renamed_14055() {
        this.cfr_renamed_11835(" ");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14093(float[] fArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_14067((float)arg0[n3]);
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_14071(byte arg0) {
        switch (arg0) {
            case 40: 
            case 41: 
            case 92: {
                this.cfr_renamed_11594((byte)92);
                this.cfr_renamed_11594(arg0);
                return;
            }
            case 13: {
                this.cfr_renamed_11835(sprvdaa.cfr_renamed_9("\u0005\u0007h\u0002"));
                return;
            }
        }
        this.cfr_renamed_11594(arg0);
    }

    @Override
    public void cfr_renamed_14094(String arg0, int arg1) {
        this.cfr_renamed_14057(arg0, sprebp.cfr_renamed_14063(arg1));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14095(sprxln sprxln2) {
        void arg0;
        sproin sproin2 = this;
        sproin2.cfr_renamed_6493().cfr_renamed_14065((sprxln)arg0);
        sproin2.cfr_renamed_11735("clip");
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14056(String[] stringArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_11835((String)arg0[n3]);
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    @sprtea
    public static String cfr_renamed_14078(float arg0) {
        if (Float.isNaN(arg0)) {
            return "0";
        }
        return sprebp.cfr_renamed_14096(arg0);
    }
}

