/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragp;
import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprbnq;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprezn;
import com.spire.presentation.packages.sprfvn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgco;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprhon;
import com.spire.presentation.packages.spriap;
import com.spire.presentation.packages.sprkyca;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprmbo;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprptn;
import com.spire.presentation.packages.sprpyn;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrin;
import com.spire.presentation.packages.sprswn;
import com.spire.presentation.packages.sprsxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprtxn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprlxn {
    private spragp cfr_renamed_102;
    private static final String cfr_renamed_93 = "GS";
    private sprwvn cfr_renamed_86;
    private sprgdo cfr_renamed_152;
    private spragp cfr_renamed_112;
    private spraxo cfr_renamed_119;
    private static final String cfr_renamed_91 = "X";
    private spragp cfr_renamed_0;
    private sprhon cfr_renamed_1;
    private spragp cfr_renamed_2;
    private static final String cfr_renamed_3 = "P";
    private static String[] cfr_renamed_4;

    private /* synthetic */ sprewn cfr_renamed_14577(sprhhp arg0, sprezn arg1, String arg2) {
        sprqvn sprqvn2 = arg1.cfr_renamed_14578() ? this.cfr_renamed_14579(arg0.cfr_renamed_13261(), arg2) : new sprptn(arg0.cfr_renamed_13261(), this.cfr_renamed_152);
        switch (arg1.cfr_renamed_14580()) {
            case 0: {
                return new sprgco(this.cfr_renamed_152, arg0.cfr_renamed_13242(), arg0.cfr_renamed_13243(), (sprmbo)sprqvn2);
            }
            case 1: {
                return new sprsxn(this.cfr_renamed_152, arg0.cfr_renamed_13242(), arg0.cfr_renamed_13243(), sprqvn2);
            }
            case 2: {
                return new sprtxn(this.cfr_renamed_152, arg0.cfr_renamed_13242(), arg0.cfr_renamed_13243(), sprqvn2, sprtxn.cfr_renamed_14581(arg0.cfr_renamed_13261()));
            }
        }
        throw new IllegalStateException(sprbnq.cfr_renamed_9("Imy{lf\u007fwyg<esmh#hzlf2"));
    }

    private static /* synthetic */ boolean cfr_renamed_14582(sprgdp arg0) {
        int n;
        if (arg0.cfr_renamed_12779() == null) {
            return arg0.cfr_renamed_12645().cfr_renamed_1778() != 255 || arg0.cfr_renamed_12645().cfr_renamed_1778() != 255;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_12779().length) {
            if (arg0.cfr_renamed_12779()[n].cfr_renamed_12553().cfr_renamed_1778() != 255) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public sprswn cfr_renamed_14583(sprpln arg0, sprgdo arg1, sprgeja arg2) {
        if (arg2.cfr_renamed_29()) {
            return null;
        }
        String string = sprlxn.cfr_renamed_14584(cfr_renamed_3, this.cfr_renamed_112.size() + 1);
        switch (arg0.cfr_renamed_13338()) {
            case 2: {
                sprpip sprpip2 = (sprpip)arg0;
                return sprswn.cfr_renamed_14585(arg1, string, this.cfr_renamed_1.cfr_renamed_14586(sprpip2), arg2);
            }
            case 1: {
                return sprswn.cfr_renamed_14587(arg1, string, (sprhlp)arg0);
            }
            case 3: {
                sprgdp sprgdp2 = (sprgdp)arg0;
                if (!sprlxn.cfr_renamed_14582(sprgdp2)) {
                    return sprswn.cfr_renamed_14588(arg1, string, sprgdp2);
                }
                sprpip sprpip3 = spriap.cfr_renamed_14589(sprgdp2, arg2);
                return sprswn.cfr_renamed_14585(arg1, string, this.cfr_renamed_1.cfr_renamed_14586(sprpip3), arg2);
            }
            case 4: {
                sprpip sprpip4 = spriap.cfr_renamed_13340((sprlrn)arg0);
                return sprswn.cfr_renamed_14585(arg1, string, this.cfr_renamed_1.cfr_renamed_14586(sprpip4), arg2);
            }
        }
        return null;
    }

    private static /* synthetic */ String cfr_renamed_14590(sprhhp arg0, sprezn arg1) {
        String[] stringArray = new String[5];
        stringArray[0] = arg0.cfr_renamed_13261().cfr_renamed_13302();
        stringArray[1] = sprebp.cfr_renamed_14591(arg0.cfr_renamed_13242());
        stringArray[2] = sprebp.cfr_renamed_14591(arg0.cfr_renamed_13243());
        stringArray[3] = sprebp.cfr_renamed_14063(arg1.cfr_renamed_14580());
        stringArray[4] = sprebp.cfr_renamed_14063(arg0.cfr_renamed_13261().cfr_renamed_2609().hashCode());
        return sprfzo.cfr_renamed_14592(stringArray);
    }

    private static /* synthetic */ boolean cfr_renamed_14593(sprfzo arg0) {
        int n;
        String[] stringArray = cfr_renamed_4;
        int n2 = cfr_renamed_4.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string = stringArray[n];
            if (sprraia.cfr_renamed_11730(arg0.cfr_renamed_13460(), string)) {
                return true;
            }
            n3 = ++n;
        }
        return false;
    }

    private static /* synthetic */ String cfr_renamed_14584(String arg0, int arg1) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = arg1;
        return sprraia.cfr_renamed_11562(sprkyca.cfr_renamed_9("v\u000epE<C"), objectArray);
    }

    private /* synthetic */ sprezn cfr_renamed_14594(sprfzo arg0, String arg1) {
        if (arg0.cfr_renamed_14132()) {
            return new sprezn(0, true);
        }
        if (arg0.cfr_renamed_14595()) {
            if (this.cfr_renamed_152.cfr_renamed_13097().cfr_renamed_14517() && sprtxn.cfr_renamed_14596(arg0)) {
                return new sprezn(2, false);
            }
            return new sprezn(0, true);
        }
        if (sprznp.cfr_renamed_12328(arg1) && sprpyn.cfr_renamed_14597(arg1)) {
            if (this.cfr_renamed_152.cfr_renamed_13097().cfr_renamed_14517() && sprtxn.cfr_renamed_14596(arg0)) {
                return new sprezn(2, false);
            }
            switch (this.cfr_renamed_152.cfr_renamed_13097().cfr_renamed_14526()) {
                case 0: {
                    return new sprezn(1, true);
                }
                case 1: {
                    return new sprezn(1, !sprlxn.cfr_renamed_14593(arg0));
                }
                case 2: {
                    return new sprezn(1, false);
                }
            }
            return new sprezn(1, true);
        }
        return new sprezn(0, true);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprswn cfr_renamed_14598(sprpln sprpln2, sprgeja sprgeja2) {
        void arg1;
        sprlxn sprlxn2 = this;
        sprswn sprswn2 = sprlxn2.cfr_renamed_14583(sprpln2, sprlxn2.cfr_renamed_152, (sprgeja)arg1);
        if (sprswn2 != null) {
            this.cfr_renamed_112.cfr_renamed_13301(sprswn2.cfr_renamed_14599(), sprswn2);
        }
        return sprswn2;
    }

    @sprtea
    public sprlxn(sprgdo sprgdo2) {
        sprlxn sprlxn2 = this;
        sprlxn sprlxn3 = this;
        this.cfr_renamed_2 = new spravp();
        sprlxn3.cfr_renamed_112 = new spravp();
        this.cfr_renamed_86 = new sprwvn();
        this.cfr_renamed_0 = new spravp();
        this.cfr_renamed_119 = new spraxo();
        sprlxn2.cfr_renamed_102 = new spravp();
        sprlxn2.cfr_renamed_1 = new sprhon();
        sprlxn2.cfr_renamed_152 = sprgdo2;
    }

    @sprtea
    public sprewn cfr_renamed_14394(sprhhp arg0, String arg1) {
        sprlxn sprlxn2 = this;
        sprezn sprezn2 = sprlxn2.cfr_renamed_14594(arg0.cfr_renamed_13261(), arg1);
        String string = sprlxn.cfr_renamed_14590(arg0, sprezn2);
        sprewn sprewn2 = (sprewn)sprlxn2.cfr_renamed_2.cfr_renamed_12347(string);
        if (sprewn2 == null) {
            sprlxn sprlxn3 = this;
            sprewn2 = sprlxn3.cfr_renamed_14577(arg0, sprezn2, string);
            sprlxn3.cfr_renamed_2.cfr_renamed_13301(string, sprewn2);
        }
        return sprewn2;
    }

    @sprtea
    public sprfvn cfr_renamed_14600(float arg0, float arg1) {
        sprfvn sprfvn22;
        for (sprfvn sprfvn22 : this.cfr_renamed_86) {
            if (!sprfvn22.cfr_renamed_14601(arg0, arg1)) continue;
            return sprfvn22;
        }
        String string = sprlxn.cfr_renamed_14584(cfr_renamed_93, this.cfr_renamed_86.size() + 1);
        sprfvn sprfvn3 = sprfvn22 = new sprfvn(this.cfr_renamed_152, string, arg0, arg1);
        sprovja.cfr_renamed_11658(this.cfr_renamed_86, sprfvn3);
        return sprfvn3;
    }

    private /* synthetic */ sprqvn cfr_renamed_14579(sprfzo arg0, String arg1) {
        sprmbo sprmbo2 = (sprmbo)this.cfr_renamed_102.cfr_renamed_12347(arg1);
        if (sprmbo2 == null) {
            sprmbo2 = new sprmbo(arg0, this.cfr_renamed_152);
            this.cfr_renamed_102.cfr_renamed_12160(arg1, sprmbo2);
        }
        return sprmbo2;
    }

    @sprtea
    public sprrin cfr_renamed_14602(byte[] arg0, sprtqo arg1) {
        sprrin sprrin2 = (sprrin)this.cfr_renamed_119.cfr_renamed_13501(arg0, arg1);
        if (sprrin2 == null) {
            String string = sprlxn.cfr_renamed_14584(cfr_renamed_91, this.cfr_renamed_0.size() + 1);
            sprrin2 = new sprrin(this.cfr_renamed_152, string, arg0, arg1);
            sprlxn sprlxn2 = this;
            sprlxn2.cfr_renamed_119.cfr_renamed_13502(arg0, arg1, sprrin2);
            sprlxn2.cfr_renamed_0.cfr_renamed_13301(sprrin2.cfr_renamed_14599(), sprrin2);
        }
        return sprrin2;
    }

    @sprtea
    public void cfr_renamed_14603(sprfy arg0) {
        Object object;
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_2.cfr_renamed_13435().iterator();
        while (iterator2.hasNext()) {
            object = (sprewn)iterator.next();
            iterator2 = iterator;
            ((sprbln)object).cfr_renamed_14291(arg0);
        }
        iterator = this.cfr_renamed_112.cfr_renamed_13435().iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            object = (sprswn)iterator.next();
            iterator3 = iterator;
            ((sprswn)object).cfr_renamed_14291(arg0);
        }
        iterator = this.cfr_renamed_86.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            object = (sprfvn)iterator.next();
            iterator4 = iterator;
            ((sprbln)object).cfr_renamed_14291(arg0);
        }
        iterator = this.cfr_renamed_0.cfr_renamed_13435().iterator();
        Iterator iterator5 = iterator;
        while (iterator5.hasNext()) {
            object = (sprrin)iterator.next();
            iterator5 = iterator;
            ((sprbln)object).cfr_renamed_14291(arg0);
        }
        iterator = this.cfr_renamed_102.cfr_renamed_13435().iterator();
        Iterator iterator6 = iterator;
        while (iterator6.hasNext()) {
            object = (sprmbo)iterator.next();
            iterator6 = iterator;
            ((sprmbo)object).cfr_renamed_14604().cfr_renamed_14291(arg0);
        }
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "Arial";
        stringArray[1] = "Times New Roman";
        cfr_renamed_4 = stringArray;
    }
}

