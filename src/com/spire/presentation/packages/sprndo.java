/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhto;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrin;
import com.spire.presentation.packages.sprswn;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtnn;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzhn;

@sprtea
public class sprndo {
    private sprgdo cfr_renamed_2;
    private sprcrn cfr_renamed_3;
    private sprttn cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ void cfr_renamed_14756(sprpln arg0, boolean arg1) {
        sprpln sprpln2;
        sprwbp sprwbp2 = sprwbp.cfr_renamed_1513;
        if (arg0.cfr_renamed_13338() == 4 && ((sprtnn)(sprpln2 = (sprlrn)arg0)).cfr_renamed_12779() != null && ((sprtnn)sprpln2).cfr_renamed_12779().length > 0) {
            sprwbp2 = ((sprtnn)sprpln2).cfr_renamed_12779()[0].cfr_renamed_12553();
        }
        sprpln2 = new sprghp(sprwbp2);
        sprndo sprndo2 = this;
        sprndo2.cfr_renamed_2.cfr_renamed_13269(2, sprudz.cfr_renamed_9("NFc\u0000y\u0007xTh\u0007~WhDdAdBi\u0007oUxTe\t-r~Nc@-TbKdC-E\u007fR~O-NcTyBlC#"));
        sprndo2.cfr_renamed_14757((sprghp)sprpln2, arg1);
    }

    @sprtea
    public void cfr_renamed_14467(sprtbp arg0, sprgeja arg1) {
        sprtbp sprtbp2 = arg0;
        sprndo sprndo2 = this;
        sprndo sprndo3 = this;
        sprtbp sprtbp3 = arg0;
        sprndo3.cfr_renamed_14465(sprtbp3.cfr_renamed_12551(), true, arg1);
        sprndo3.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14386(arg0.cfr_renamed_1942(), this.cfr_renamed_3);
        int n = sprhto.cfr_renamed_14123(sprtbp3);
        sprndo2.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14758(n, this.cfr_renamed_3);
        sprndo2.cfr_renamed_14759(arg0, n);
        int n2 = sprhto.cfr_renamed_14124(sprtbp2);
        this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14760(n2, this.cfr_renamed_3);
        if (sprtbp2.cfr_renamed_12576() == 3) {
            this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14761(arg0.cfr_renamed_13149(), this.cfr_renamed_3);
        }
        if (arg0.cfr_renamed_13153() != 0) {
            sprndo.cfr_renamed_14762(sprhto.cfr_renamed_14125(arg0, n != 0), arg0.cfr_renamed_13154(), this.cfr_renamed_3);
        }
        if (arg0.cfr_renamed_14763().length > 0) {
            this.cfr_renamed_2.cfr_renamed_13269(2, sprzhn.cfr_renamed_9("\u0006\u001d(\u0002*\u0007+\u0016e\u001e,\u001c \u0001e\u00137\u0017e\u001c*\u0006e\u00010\u00025\u001d7\u0006 \u0016kR\u0010\u0001,\u001c\"R6\u001d)\u001b!R)\u001b+\u0017e\u001b+\u00011\u0017$\u0016k"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public void cfr_renamed_14465(sprpln arg0, boolean arg1, sprgeja arg2) {
        switch (arg0.cfr_renamed_13338()) {
            case 0: {
                this.cfr_renamed_14757((sprghp)arg0, arg1);
                return;
            }
        }
        sprswn sprswn2 = this.cfr_renamed_4.cfr_renamed_14598(arg0, arg2);
        if (sprswn2 != null) {
            sprndo sprndo2 = this;
            this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14764(sprswn2.cfr_renamed_14599(), arg1, sprndo2.cfr_renamed_3, sprndo2.cfr_renamed_4);
            return;
        }
        this.cfr_renamed_14756(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_14762(float[] fArray, float f, sprcrn sprcrn2) {
        void arg1;
        float[] arg0;
        void arg2;
        void v0 = arg2;
        void v1 = arg2;
        v1.cfr_renamed_14093(arg0);
        v1.cfr_renamed_11835(" ");
        v0.cfr_renamed_11835(spryjn.cfr_renamed_14078((float)arg1));
        v0.cfr_renamed_11835(sprudz.cfr_renamed_9("-C-"));
    }

    private /* synthetic */ void cfr_renamed_14759(sprtbp arg0, int arg1) {
        boolean bl;
        boolean bl2 = bl = !sprhto.cfr_renamed_14246(arg0.cfr_renamed_13151(), arg1) || !sprhto.cfr_renamed_14246(arg0.cfr_renamed_13152(), arg1);
        if (arg0.cfr_renamed_13153() != 0) {
            boolean bl3 = bl = bl || !sprhto.cfr_renamed_14243(arg0.cfr_renamed_13156(), arg1);
        }
        if (bl) {
            this.cfr_renamed_2.cfr_renamed_13269(2, sprzhn.cfr_renamed_9("\u0016\u0006<\u001e \u0001e\u001d#R)\u001b+\u0017e\u00011\u00137\u0006iR \u001c!R*\u0000e\u0016$\u0001-R&\u00135\u0001e\u00137\u0017e\u0007+\u00010\u00025\u001d7\u0006 \u0016e\u0013+\u0016e\u001a$\u0004 R'\u0017 \u001ce\u0011-\u0013+\u0015 \u0016k"));
        }
    }

    @sprtea
    public void cfr_renamed_14737(byte[] arg0, sprqgp arg1, sprtqo arg2, sprqgp arg3) {
        sprqgp sprqgp2 = arg3.cfr_renamed_12099();
        sprqgp2.cfr_renamed_12634(arg1, 0);
        sprndo sprndo2 = this;
        sprndo sprndo3 = this;
        this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14481(sprndo3.cfr_renamed_3);
        sprndo3.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14453(arg1, this.cfr_renamed_3);
        sprndo sprndo4 = this;
        sprndo2.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14765(sprndo4.cfr_renamed_3, sprndo4.cfr_renamed_4);
        sprrin sprrin2 = sprndo2.cfr_renamed_4.cfr_renamed_14602(arg0, arg2);
        sprrin2.cfr_renamed_14230(sprqgp2);
        this.cfr_renamed_3.cfr_renamed_14405(sprudz.cfr_renamed_9("\"\\=Z-cb"), sprrin2.cfr_renamed_14599());
        sprndo2.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14482(this.cfr_renamed_3);
    }

    private /* synthetic */ void cfr_renamed_14757(sprghp arg0, boolean arg1) {
        sprwbp sprwbp2 = arg0.cfr_renamed_12553();
        if (this.cfr_renamed_2.cfr_renamed_14358() && arg0.cfr_renamed_12553().cfr_renamed_1778() < 255) {
            sprwbp2 = sprwbp.cfr_renamed_14766(sprwbp2, sprwbp.cfr_renamed_955);
            this.cfr_renamed_2.cfr_renamed_13269(2, sprzhn.cfr_renamed_9("\u0011\u0000$\u001c6\u0002$\u0000 \u001c&\u000be\u0016*\u00176R+\u001d1R&\u001d+\u0014*\u0000(\u0001e\u0005,\u0006-R\u00156\u0003]\u0004R6\u0006$\u001c!\u00137\u0016kR\u0011\u0000$\u001c6\u0002$\u0000 \u001c1R'\u00000\u0001-R-\u00136R'\u0017 \u001ce\u001f$\u0016 R*\u0002$\u00030\u0017k"));
        }
        sprndo sprndo2 = this;
        this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14384(sprwbp2, arg1, sprndo2.cfr_renamed_3, sprndo2.cfr_renamed_4);
    }

    @sprtea
    public void cfr_renamed_14204(byte[] arg0, sprgeja arg1, sprtqo arg2) {
        sprqgp sprqgp2 = new sprqgp(arg1.cfr_renamed_1942(), 0.0f, 0.0f, -arg1.cfr_renamed_1452(), arg1.cfr_renamed_1980(), arg1.spr\u3181() + arg1.cfr_renamed_1452());
        this.cfr_renamed_14737(arg0, sprqgp2, arg2, this.cfr_renamed_2.cfr_renamed_14350().cfr_renamed_14103().cfr_renamed_12491());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprndo(sprgdo sprgdo2, sprttn sprttn2, sprcrn sprcrn2) {
        void arg1;
        void arg0;
        sprndo sprndo2 = this;
        this.cfr_renamed_2 = arg0;
        sprndo2.cfr_renamed_4 = arg1;
        sprndo2.cfr_renamed_3 = sprcrn2;
    }
}

