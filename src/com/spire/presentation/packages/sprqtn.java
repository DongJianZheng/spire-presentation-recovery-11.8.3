/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraco;
import com.spire.presentation.packages.sprceo;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprcwn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhbga;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprlbo;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprmwn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpmn;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqbo;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsro;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvdo;
import com.spire.presentation.packages.sprvio;
import com.spire.presentation.packages.sprvjo;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryyn;
import com.spire.presentation.packages.sprzio;
import com.spire.presentation.packages.sprzmq;
import java.util.Iterator;

@sprtea
public class sprqtn {
    private spryyn cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_15149(sprzio arg0, sprthn arg1, sprsuja arg2, float[] arg3, sprlbo arg4) {
        Object object;
        sprcwn sprcwn2 = new sprcwn();
        sprcwn2.cfr_renamed_15150(Double.valueOf(spraco.cfr_renamed_15139(arg2.cfr_renamed_1980())), Double.valueOf(spraco.cfr_renamed_15139(arg2.spr\u3181())));
        if (arg3.length > 1) {
            int n;
            object = new float[arg3.length - 1];
            int n2 = n = 0;
            while (n2 < arg3.length - 1) {
                int n3 = n++;
                object[n3] = arg3[n3];
                n2 = n;
            }
            sprcwn2.cfr_renamed_15151(spraco.cfr_renamed_15137((float[])object));
        }
        if (arg4.cfr_renamed_14878()) {
            object = new sprmwn();
            ((sprmwn)object).cfr_renamed_15152(arg1.cfr_renamed_13030().length()).cfr_renamed_15153(arg1.cfr_renamed_13030().length()).cfr_renamed_15154(0);
            sprvio sprvio2 = new sprvio();
            Iterator iterator = new sprcop(arg1.cfr_renamed_13030()).iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                int n = (Integer)iterator.next();
                iterator2 = iterator;
                int n4 = arg1.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_13469(n).cfr_renamed_13076();
                sprvio2.cfr_renamed_4693(Integer.toString(arg4.cfr_renamed_15155().cfr_renamed_13411().cfr_renamed_14862(n4)));
            }
            ((sprmwn)object).cfr_renamed_15156(sprvio2);
            arg0.cfr_renamed_15157((sprmwn)object);
        }
        sprcwn2.cfr_renamed_15158(spraco.cfr_renamed_12422(arg1.cfr_renamed_13030()));
        arg0.cfr_renamed_15159(sprcwn2);
    }

    private /* synthetic */ sprzio cfr_renamed_15160(sprthn arg0, sprgeja arg1) {
        sprceo sprceo2;
        Object object;
        Object object2;
        Object object3;
        int n;
        sprpon[] sprponArray = arg0.cfr_renamed_13256();
        sprzio sprzio2 = new sprzio(this.cfr_renamed_4.cfr_renamed_15161().cfr_renamed_15162());
        sprlbo sprlbo2 = this.cfr_renamed_15163(arg0.cfr_renamed_13257());
        float f = 0.0f;
        sprvrx<Float> sprvrx2 = new sprvrx<Float>();
        Object[] objectArray = sprponArray;
        int n2 = sprponArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            object3 = objectArray[n];
            object2 = ((sprpon)object3).cfr_renamed_13027();
            int n5 = ((sprqjn[])object2).length;
            int n6 = n4 = 0;
            while (n6 < n5) {
                object = object2[n4];
                sprqjn sprqjn2 = object;
                sprlbo2.cfr_renamed_15155().cfr_renamed_14874(sprqjn2.cfr_renamed_13072(), ((sprpon)object3).cfr_renamed_13079()[0]);
                float f2 = sprqjn2.cfr_renamed_13070(arg0.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13317(), arg0.cfr_renamed_13257().cfr_renamed_13265());
                f += f2;
                sprvrx2.add(Float.valueOf(f2));
                n6 = ++n4;
            }
            n3 = ++n;
        }
        objectArray = sprhbga.cfr_renamed_14977(sprvrx2.toArray(), null);
        sprphja sprphja2 = new sprphja(f, arg0.cfr_renamed_13257().cfr_renamed_15164());
        sprthn sprthn2 = arg0;
        sprsuja sprsuja2 = sprthn2.cfr_renamed_9494();
        if (sprsro.cfr_renamed_15165(sprthn2.cfr_renamed_13094()) == 0 && arg0.cfr_renamed_13094().cfr_renamed_12598() < 0.0f) {
            sprphja sprphja3 = sprphja2;
            sprsuja2.cfr_renamed_12618(arg0.cfr_renamed_13110().spr\u3181() + (arg0.cfr_renamed_13110().spr\u3181() - arg0.cfr_renamed_9494().spr\u3181()));
            sprphja3.cfr_renamed_15166(-sprphja3.cfr_renamed_1452());
        }
        object3 = arg0.cfr_renamed_13094().cfr_renamed_12099();
        ((sprqgp)object3).cfr_renamed_12634(this.cfr_renamed_4.cfr_renamed_15167(), 1);
        object2 = sprxln.cfr_renamed_13253(new sprgeja(sprsuja2, sprphja2));
        sprceo sprceo3 = sprceo2 = new sprceo();
        ((sprxln)object2).cfr_renamed_13121(sprceo3);
        sprgeja sprgeja2 = sprceo3.cfr_renamed_15168((sprqgp)object3);
        sprgeja2 = sprgeja.cfr_renamed_13776(sprgeja2, arg1);
        ((sprvjo)sprzio2.cfr_renamed_15169(spraco.cfr_renamed_15147(sprgeja2))).cfr_renamed_15170(Double.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_13257().cfr_renamed_13265())));
        object = new sprqgp(((sprqgp)object3).cfr_renamed_12595(), ((sprqgp)object3).cfr_renamed_12596(), ((sprqgp)object3).cfr_renamed_12597(), ((sprqgp)object3).cfr_renamed_12598(), 0.0f, 0.0f);
        sprzio2.cfr_renamed_15171(spraco.cfr_renamed_15148((sprqgp)object));
        sprsuja sprsuja3 = ((sprqgp)object3).cfr_renamed_13791(arg0.cfr_renamed_13110());
        sprsuja3 = ((sprqgp)object).cfr_renamed_14487().cfr_renamed_13791(new sprsuja(sprsuja3.cfr_renamed_1980() - sprgeja2.cfr_renamed_1980(), sprsuja3.spr\u3181() - sprgeja2.spr\u3181()));
        sprzio sprzio3 = sprzio2;
        sprthn sprthn3 = arg0;
        this.cfr_renamed_15172(sprzio2, sprthn3, sprlbo2);
        this.cfr_renamed_15173(sprzio3, sprthn3, sprsuja3, (Float[])objectArray, sprlbo2);
        sprzio3.cfr_renamed_15174(sprlbo2.cfr_renamed_6005().cfr_renamed_15175());
        return sprzio2;
    }

    private /* synthetic */ void cfr_renamed_15173(sprzio arg0, sprthn arg1, sprsuja arg2, Float[] arg3, sprlbo arg4) {
        Object[] objectArray;
        sprcwn sprcwn2 = new sprcwn();
        sprcwn2.cfr_renamed_15150(Double.valueOf(spraco.cfr_renamed_15139(arg2.cfr_renamed_1980())), Double.valueOf(spraco.cfr_renamed_15139(arg2.spr\u3181())));
        if (arg3.length > 1) {
            int n;
            objectArray = new float[arg3.length - 1];
            int n2 = n = 0;
            while (n2 < arg3.length - 1) {
                int n3 = n++;
                objectArray[n3] = (sprpon)arg3[n3].floatValue();
                n2 = n;
            }
            sprcwn2.cfr_renamed_15151(spraco.cfr_renamed_15137((float[])objectArray));
        }
        if (arg4.cfr_renamed_14878()) {
            int n;
            objectArray = arg1.cfr_renamed_13256();
            sprmwn sprmwn2 = new sprmwn();
            sprvio sprvio2 = new sprvio();
            Object[] objectArray2 = objectArray;
            int n4 = objectArray.length;
            int n5 = n = 0;
            while (n5 < n4) {
                int n6;
                sprqjn[] sprqjnArray = objectArray2[n].cfr_renamed_13027();
                int n7 = sprqjnArray.length;
                int n8 = n6 = 0;
                while (n8 < n7) {
                    int n9 = sprqjnArray[n6].cfr_renamed_13072();
                    sprvio2.cfr_renamed_4693(Integer.toString(arg4.cfr_renamed_15155().cfr_renamed_13411().cfr_renamed_14862(n9)));
                    n8 = ++n6;
                }
                n5 = ++n;
            }
            sprmwn2.cfr_renamed_15152(sprvio2.cfr_renamed_6629().size()).cfr_renamed_15153(arg1.cfr_renamed_13030().length()).cfr_renamed_15154(0);
            sprmwn2.cfr_renamed_15156(sprvio2);
            arg0.cfr_renamed_15157(sprmwn2);
        }
        sprcwn2.cfr_renamed_15158(spraco.cfr_renamed_12422(arg1.cfr_renamed_13030()));
        arg0.cfr_renamed_15159(sprcwn2);
    }

    private /* synthetic */ void cfr_renamed_15176(sprthn arg0, int[] arg1, float[] arg2, sprlbo arg3) {
        Iterator iterator;
        sprpmn sprpmn2 = null;
        if (null != arg0.cfr_renamed_12567()) {
            sprpmn2 = new sprpmn(arg0.cfr_renamed_12567());
        }
        int n = 0;
        Iterator iterator2 = iterator = new sprcop(arg0.cfr_renamed_13030()).iterator();
        while (iterator2.hasNext()) {
            sprlbo sprlbo2;
            int n2 = (Integer)iterator.next();
            int n3 = n2;
            if (n3 > 65535) {
                n3 = -1;
            }
            int n4 = arg1[n] = n3 < 0 ? 0 : n3;
            if (null != sprpmn2) {
                sprlbo2 = arg3;
                int n5 = n;
                arg2[n5] = sprpmn2.cfr_renamed_13353(n) + sprpmn2.cfr_renamed_13354(n5);
            } else {
                arg2[n] = arg0.cfr_renamed_13257().cfr_renamed_14982(n2);
                sprlbo2 = arg3;
            }
            if (sprlbo2.cfr_renamed_14878()) {
                arg3.cfr_renamed_15155().cfr_renamed_15177(n2);
            }
            ++n;
            iterator2 = iterator;
        }
    }

    private /* synthetic */ sprzio cfr_renamed_15178(sprthn arg0, sprgeja arg1) {
        sprceo sprceo2;
        int n;
        sprzio sprzio2 = new sprzio(this.cfr_renamed_4.cfr_renamed_15161().cfr_renamed_15162());
        sprqtn sprqtn2 = this;
        sprlbo sprlbo2 = sprqtn2.cfr_renamed_15163(arg0.cfr_renamed_13257());
        sprthn sprthn2 = arg0;
        sprthn sprthn3 = arg0;
        sprphja sprphja2 = sprthn2.cfr_renamed_13257().cfr_renamed_13729(sprthn3.cfr_renamed_13030());
        int n2 = sprthn2.cfr_renamed_13030().length();
        int[] nArray = new int[n2];
        float[] fArray = new float[n2];
        sprqtn2.cfr_renamed_15176(sprthn3, nArray, fArray, sprlbo2);
        float f = 0.0f;
        int n3 = n = 0;
        while (n3 < fArray.length) {
            f += fArray[n++];
            n3 = n;
        }
        sprphja2.cfr_renamed_12572(f > sprphja2.cfr_renamed_1942() ? f : sprphja2.cfr_renamed_1942());
        sprthn sprthn4 = arg0;
        sprsuja sprsuja2 = sprthn4.cfr_renamed_9494();
        if (sprsro.cfr_renamed_15165(sprthn4.cfr_renamed_13094()) == 0 && arg0.cfr_renamed_13094().cfr_renamed_12598() < 0.0f) {
            sprphja sprphja3 = sprphja2;
            sprsuja2.cfr_renamed_12618(arg0.cfr_renamed_13110().spr\u3181() + (arg0.cfr_renamed_13110().spr\u3181() - arg0.cfr_renamed_9494().spr\u3181()));
            sprphja3.cfr_renamed_15166(-sprphja3.cfr_renamed_1452());
        }
        sprqgp sprqgp2 = arg0.cfr_renamed_13094().cfr_renamed_12099();
        sprqgp2.cfr_renamed_12634(this.cfr_renamed_4.cfr_renamed_15167(), 1);
        sprxln sprxln2 = sprxln.cfr_renamed_13253(new sprgeja(sprsuja2, sprphja2));
        sprceo sprceo3 = sprceo2 = new sprceo();
        sprxln2.cfr_renamed_13121(sprceo3);
        sprgeja sprgeja2 = sprceo3.cfr_renamed_15168(sprqgp2);
        sprgeja2 = sprgeja.cfr_renamed_13776(sprgeja2, arg1);
        ((sprvjo)sprzio2.cfr_renamed_15169(spraco.cfr_renamed_15147(sprgeja2))).cfr_renamed_15170(Double.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_13257().cfr_renamed_13265())));
        sprqgp sprqgp3 = new sprqgp(sprqgp2.cfr_renamed_12595(), sprqgp2.cfr_renamed_12596(), sprqgp2.cfr_renamed_12597(), sprqgp2.cfr_renamed_12598(), 0.0f, 0.0f);
        sprzio2.cfr_renamed_15171(spraco.cfr_renamed_15148(sprqgp3));
        sprsuja sprsuja3 = sprqgp2.cfr_renamed_13791(arg0.cfr_renamed_13110());
        sprsuja3 = sprqgp3.cfr_renamed_14487().cfr_renamed_13791(new sprsuja(sprsuja3.cfr_renamed_1980() - sprgeja2.cfr_renamed_1980(), sprsuja3.spr\u3181() - sprgeja2.spr\u3181()));
        sprzio sprzio3 = sprzio2;
        sprthn sprthn5 = arg0;
        this.cfr_renamed_15172(sprzio2, sprthn5, sprlbo2);
        this.cfr_renamed_15149(sprzio3, sprthn5, sprsuja3, fArray, sprlbo2);
        sprzio3.cfr_renamed_15174(sprlbo2.cfr_renamed_6005().cfr_renamed_15175());
        return sprzio2;
    }

    private /* synthetic */ void cfr_renamed_15172(sprzio arg0, sprthn arg1, sprlbo arg2) {
        sprlbo sprlbo2;
        if (sprwbp.cfr_renamed_13267(arg1.cfr_renamed_12553(), sprwbp.cfr_renamed_1447)) {
            sprlbo2 = arg2;
            arg0.cfr_renamed_15179(true).cfr_renamed_15180(spraco.cfr_renamed_15142(arg1.cfr_renamed_12553()));
        } else {
            arg0.cfr_renamed_15179(false);
            sprlbo2 = arg2;
        }
        if (sprlbo2.cfr_renamed_14878()) {
            if (arg1.cfr_renamed_13257().cfr_renamed_13242()) {
                arg0.cfr_renamed_15181(sprvdo.cfr_renamed_152);
            }
            if (arg1.cfr_renamed_13257().cfr_renamed_13243()) {
                arg0.cfr_renamed_15182(true);
            }
        }
    }

    private /* synthetic */ sprlbo cfr_renamed_15163(sprhhp arg0) {
        sprqtn sprqtn2;
        String string;
        boolean bl;
        String string2 = arg0.cfr_renamed_13460();
        boolean bl2 = bl = null != arg0.cfr_renamed_13261();
        if (bl) {
            string = string2 = arg0.cfr_renamed_13261().cfr_renamed_13302();
        } else {
            if (arg0.cfr_renamed_13261().cfr_renamed_13750() || arg0.cfr_renamed_13261().cfr_renamed_15183()) {
                string2 = sprraia.cfr_renamed_11961(string2, new StringBuilder().insert(0, ",").append(arg0.cfr_renamed_13461()).toString());
            }
            string = string2;
        }
        string2 = spraco.cfr_renamed_12422(string);
        if (this.cfr_renamed_4.cfr_renamed_15184().cfr_renamed_12143(string2)) {
            return (sprlbo)this.cfr_renamed_4.cfr_renamed_15184().cfr_renamed_12347(string2);
        }
        sprlbo sprlbo2 = new sprlbo().cfr_renamed_15185(string2).cfr_renamed_15186(string2).cfr_renamed_15187(this.cfr_renamed_4.cfr_renamed_15161().cfr_renamed_15162());
        if (bl) {
            sprlgo sprlgo2 = sprlgo.cfr_renamed_141(new StringBuilder().insert(0, sprzmq.cfr_renamed_9("+I#R\u0012")).append(this.cfr_renamed_4.cfr_renamed_15184().size()).append(".ttf").toString());
            sprqtn2 = this;
            sprlbo2.cfr_renamed_15188(sprlgo2);
            sprlbo2.cfr_renamed_15189(new sprqbo(arg0.cfr_renamed_13261()));
        } else {
            if (arg0.cfr_renamed_13261().cfr_renamed_13750()) {
                sprlbo2.cfr_renamed_15190(true);
            }
            if (arg0.cfr_renamed_13261().cfr_renamed_15183()) {
                sprlbo2.cfr_renamed_15182(true);
            }
            sprqtn2 = this;
        }
        sprqtn2.cfr_renamed_4.cfr_renamed_15191().cfr_renamed_15192(sprlbo2);
        this.cfr_renamed_4.cfr_renamed_15184().cfr_renamed_12160(string2, sprlbo2);
        return sprlbo2;
    }

    public sprqtn(spryyn spryyn2) {
        this.cfr_renamed_4 = spryyn2;
    }

    @sprtea
    public sprzio cfr_renamed_15193(sprthn arg0, sprgeja arg1) {
        if (arg0.cfr_renamed_13256() != null) {
            return this.cfr_renamed_15160(arg0, arg1);
        }
        return this.cfr_renamed_15178(arg0, arg1);
    }
}

