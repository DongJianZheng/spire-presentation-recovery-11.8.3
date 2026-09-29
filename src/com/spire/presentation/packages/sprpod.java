/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprezd;
import com.spire.presentation.packages.sprfsd;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.spria;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmme;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sproi;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprrl;
import com.spire.presentation.packages.sprsrd;
import com.spire.presentation.packages.sprtyd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwme;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class sprpod {
    private sprije cfr_renamed_132;
    private sprvte cfr_renamed_102;
    private sprrl cfr_renamed_93;
    private boolean cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private sprsrd cfr_renamed_112;
    private final sprere cfr_renamed_119;
    private sprije cfr_renamed_91;
    private sprfve cfr_renamed_0;
    private sprtzd cfr_renamed_1;
    private sprvte cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprere cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_3957(sprfsd arg0) throws sprlqd {
        Object object;
        Object object2;
        Object object3;
        sprga sprga2;
        String string = spraud.cfr_renamed_3.cfr_renamed_3958(this.cfr_renamed_3959());
        try {
            sprpod sprpod2 = this;
            sprga2 = arg0.cfr_renamed_3952(sprpod2.cfr_renamed_132, sprpod2.cfr_renamed_0.cfr_renamed_410());
        }
        catch (sprfya sprfya2) {
            throw new sprlqd(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("(1%w?p(\".1?5k3$>?5%$k&.\"\"6\"59jk")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
        {
            Object object4;
            block31: {
                block33: {
                    block32: {
                        block30: {
                            sprpod sprpod3;
                            object3 = sprga2.cfr_renamed_470();
                            if (this.cfr_renamed_3 != null) break block30;
                            object2 = arg0.cfr_renamed_628(this.cfr_renamed_3960());
                            if (this.cfr_renamed_93 != null) {
                                OutputStream outputStream;
                                object = object2.cfr_renamed_470();
                                if (this.cfr_renamed_4 == null) {
                                    if (sprga2 instanceof spria) {
                                        OutputStream outputStream2 = object;
                                        outputStream = outputStream2;
                                        this.cfr_renamed_93.cfr_renamed_624(outputStream2);
                                    } else {
                                        spruva spruva2 = new spruva((OutputStream)object, (OutputStream)object3);
                                        outputStream = object;
                                        spruva spruva3 = spruva2;
                                        this.cfr_renamed_93.cfr_renamed_624(spruva3);
                                        ((OutputStream)spruva3).close();
                                    }
                                } else {
                                    this.cfr_renamed_93.cfr_renamed_624((OutputStream)object);
                                    outputStream = object;
                                    ((OutputStream)object3).write(this.cfr_renamed_3961());
                                }
                                outputStream.close();
                                sprpod3 = this;
                            } else {
                                if (this.cfr_renamed_4 == null) {
                                    throw new sprlqd(sprixl.cfr_renamed_9("_.O.\u001b!T;\u001b*U,Z?H:W.O*_oR!\u001b<R(U.O:I*\u001bb\u001b:H*\u001b+^;Z,S*_oX U<O=N,O Ia"));
                                }
                                sprpod sprpod4 = this;
                                sprpod3 = sprpod4;
                                ((OutputStream)object3).write(sprpod4.cfr_renamed_3961());
                            }
                            sprpod3.cfr_renamed_3 = object2.cfr_renamed_580();
                            object4 = object3;
                            break block31;
                        }
                        if (this.cfr_renamed_4 != null) break block32;
                        if (this.cfr_renamed_93 == null) break block33;
                        OutputStream outputStream = object3;
                        object4 = outputStream;
                        this.cfr_renamed_93.cfr_renamed_624(outputStream);
                        break block31;
                    }
                    ((OutputStream)object3).write(this.cfr_renamed_3961());
                }
                object4 = object3;
            }
            ((OutputStream)object4).close();
        }
        object3 = this.cfr_renamed_3962(sproi.cfr_renamed_1, sprqzo.cfr_renamed_9("3$>?5%$f$2 ."));
        if (object3 == null) {
            if (!this.cfr_renamed_86 && this.cfr_renamed_4 != null) {
                throw new sprlqd(sprixl.cfr_renamed_9("\u001bS*\u001b,T!O*U;\u0016;B?^oZ;O=R-N;^oO6K*\u001b\u0002n\u001cooY*\u001b?I*H*U;\u001b8S*U*M*IoH&\\!^+\u001b.O;I&Y:O*HoZ=^oK=^<^!OoR!\u001b<R(U*_b_.O."));
            }
        } else {
            if (this.cfr_renamed_86) {
                throw new sprlqd(sprqzo.cfr_renamed_9("\u000b\r?9p(?>>?59p89,>*$>\".#g\rk$#5k#\"7%5/\u0011?$99)%?58p-9.</p\u0006\u0005\u0018\u0004k\u001e\u0004\u0004k3$>?1\">k1k3$>?5%$f$2 .p*$?\"\"2>$."));
            }
            if (!(object3 instanceof sprtzd)) {
                throw new sprlqd(sprixl.cfr_renamed_9("X U;^!ObO6K*\u001b.O;I&Y:O*\u001b9Z#N*\u001b!T;\u001b ]oz\u001cua\noO6K*\u001bht\rq\nx\u001b\u001b\u0006\u007f\nu\u001br\tr\nih"));
            }
            object2 = (sprtzd)object3;
            if (!((sprvva)object2).equals(this.cfr_renamed_1)) {
                throw new sprlqd(sprqzo.cfr_renamed_9("3$>?5%$f$2 .p*$?\"\"2>$.p=1'%.p/?.#k>$$k=*$(8k5\b?%$.>?\u00042 ."));
            }
        }
        if ((object3 = this.cfr_renamed_3962(sproi.cfr_renamed_3, sprixl.cfr_renamed_9("V*H<Z(^b_&\\*H;"))) == null) {
            if (this.cfr_renamed_4 != null) {
                throw new sprlqd(sprqzo.cfr_renamed_9("?8.p&58#*7.}/9,58$k#\"7%5/p*$?\"\"2>$.p?);5k\u001d\u001e\u0003\u001fp)5k 9585%$k'#5%p?8.\".p*\".p*>2p89,>.4k1?$99)%?58p;\".#.>?"));
            }
        } else {
            if (!(object3 instanceof sprxue)) {
                throw new sprlqd(sprixl.cfr_renamed_9("\"^<H.\\*\u0016+R(^<OoZ;O=R-N;^oM.W:^oU OoT)\u001b\u000eh\u0001\u0015~\u001b;B?^o\u001c\u0000x\u001b~\u001b\u001b\u001co\u001dr\u0001|h"));
            }
            object2 = (sprxue)object3;
            if (!sprzra.cfr_renamed_559(this.cfr_renamed_3, ((sprxue)object2).cfr_renamed_186())) {
                throw new sprezd(sprqzo.cfr_renamed_9("=.#81,5f4\"7.#?p*$?\"\"2>$.p=1'%.p/?.#k>$$k=*$(8k3*<(%'1?5/p=1'%."));
            }
        }
        if ((object3 = this.cfr_renamed_619()) != null && ((sprvte)object3).cfr_renamed_575(sproi.cfr_renamed_2).cfr_renamed_84() > 0) {
            throw new sprlqd(sprixl.cfr_renamed_9("\u000e\u001b,T:U;^=H&\\!Z;N=^oZ;O=R-N;^ov\u001ah\u001b\u001b\u0001t\u001b\u001b-^oZoH&\\!^+\u001b.O;I&Y:O*"));
        }
        object2 = this.cfr_renamed_574();
        if (object2 != null) {
            int n;
            object = ((sprvte)object2).cfr_renamed_575(sproi.cfr_renamed_2);
            int n2 = n = 0;
            while (n2 < ((sprlre)object).cfr_renamed_84()) {
                if (((sprche)((sprlre)object).cfr_renamed_576(n)).cfr_renamed_206().cfr_renamed_84() < 1) {
                    throw new sprlqd(sprqzo.cfr_renamed_9("\np(?>>?59#\"7%1?%95k1?$99)%?5k\u001d\u001e\u0003\u001fp(?%$*9%p*$k<.18$k?%5k\u0011?$99)%?5\u001d1'%."));
                }
                n2 = ++n;
            }
        }
        try {
            if (this.cfr_renamed_4 == null && this.cfr_renamed_3 != null && sprga2 instanceof spria) {
                object3 = (spria)((Object)sprga2);
                if (string.equals("RSA")) {
                    object2 = new sprnje(new sprije(this.cfr_renamed_91.cfr_renamed_593(), sprume.cfr_renamed_3), this.cfr_renamed_3);
                    return object3.cfr_renamed_1532(((sprkra)object2).cfr_renamed_104("DER"), this.cfr_renamed_79());
                }
                return object3.cfr_renamed_1532(this.cfr_renamed_3, this.cfr_renamed_79());
            }
            return sprga2.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (IOException iOException) {
            throw new sprlqd(sprixl.cfr_renamed_9("X.UhOoK=T,^<HoV&V*\u001b Y%^,OoO \u001b,I*Z;^oH&\\!Z;N=^a"), iOException);
        }
    }

    public boolean cfr_renamed_3963() {
        return this.cfr_renamed_86;
    }

    public byte[] cfr_renamed_3961() throws IOException {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_91();
        }
        return null;
    }

    public String cfr_renamed_3959() {
        return this.cfr_renamed_132.cfr_renamed_593().cfr_renamed_19();
    }

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprqzo.cfr_renamed_9("&5?8$4k3*>k?%<2p)5k3*<'5/p*6?59p=599-)e"));
        }
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public boolean cfr_renamed_632(sprfsd arg0) throws sprlqd {
        sprmme sprmme2 = this.cfr_renamed_3965();
        if (arg0.cfr_renamed_613() && sprmme2 != null && !arg0.cfr_renamed_614().cfr_renamed_631(sprmme2.cfr_renamed_110())) {
            throw new sprtyd(sprixl.cfr_renamed_9("9^=R)R*IoU OoM.W&_oZ;\u001b<R(U&U(o&V*"));
        }
        return this.cfr_renamed_3957(arg0);
    }

    public sprvte cfr_renamed_619() {
        if (this.cfr_renamed_4 != null && this.cfr_renamed_102 == null) {
            sprpod sprpod2 = this;
            this.cfr_renamed_102 = new sprvte(this.cfr_renamed_4);
        }
        return this.cfr_renamed_102;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmme cfr_renamed_3965() throws sprlqd {
        sprvva sprvva2 = this.cfr_renamed_3962(sproi.cfr_renamed_4, sprqzo.cfr_renamed_9("#\"7%9%7f$\"=."));
        if (sprvva2 == null) {
            return null;
        }
        try {
            return sprmme.cfr_renamed_23(sprvva2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprixl.cfr_renamed_9("<R(U&U(\u0016;R\"^oZ;O=R-N;^oM.W:^oU OoZoM.W&_o\u001c\u001bR\"^h\u001b<O=N,O:I*"));
        }
    }

    public sprije cfr_renamed_3960() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3966() {
        try {
            sprpod sprpod2 = this;
            return sprpod2.cfr_renamed_3956(sprpod2.cfr_renamed_91.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("533. ?9$>k7.$?9%7k4\"7.#?p;191&5?59#k")).append(exception).toString());
        }
    }

    public sprvte cfr_renamed_574() {
        if (this.cfr_renamed_119 != null && this.cfr_renamed_2 == null) {
            sprpod sprpod2 = this;
            this.cfr_renamed_2 = new sprvte(this.cfr_renamed_119);
        }
        return this.cfr_renamed_2;
    }

    public static sprpod cfr_renamed_3967(sprpod arg0, sprvte arg1) {
        sprfve sprfve2 = arg0.cfr_renamed_0;
        sprcwe sprcwe2 = null;
        if (arg1 != null) {
            sprcwe2 = new sprcwe(arg1.cfr_renamed_3968());
        }
        sprpod sprpod2 = arg0;
        return new sprpod(new sprfve(sprfve2.cfr_renamed_634(), sprfve2.cfr_renamed_410(), sprfve2.cfr_renamed_3969(), sprfve2.cfr_renamed_3970(), sprfve2.cfr_renamed_3971(), sprcwe2), sprpod2.cfr_renamed_1, sprpod2.cfr_renamed_93, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprpod(sprfve sprfve2, sprtzd sprtzd2, sprrl sprrl2, byte[] byArray) {
        void arg3;
        void arg2;
        sprpod sprpod2;
        void arg1;
        void arg0;
        sprpod sprpod3 = this;
        this.cfr_renamed_0 = arg0;
        sprpod3.cfr_renamed_1 = arg1;
        sprpod3.cfr_renamed_86 = sprtzd2 == null;
        sprwme sprwme2 = arg0.cfr_renamed_634();
        if (sprwme2.cfr_renamed_3972()) {
            sprxue sprxue2 = sprxue.cfr_renamed_23(sprwme2.cfr_renamed_19());
            sprpod2 = this;
            this.cfr_renamed_112 = new sprsrd(sprxue2.cfr_renamed_186());
        } else {
            sprvre sprvre2 = sprvre.cfr_renamed_23(sprwme2.cfr_renamed_19());
            sprpod2 = this;
            this.cfr_renamed_112 = new sprsrd(sprvre2.cfr_renamed_313(), sprvre2.cfr_renamed_114().cfr_renamed_97());
        }
        sprpod2.cfr_renamed_91 = arg0.cfr_renamed_410();
        sprpod sprpod4 = this;
        sprpod sprpod5 = this;
        void v4 = arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_3969();
        this.cfr_renamed_119 = v4.cfr_renamed_3973();
        sprpod5.cfr_renamed_132 = v4.cfr_renamed_3970();
        sprpod5.cfr_renamed_152 = arg0.cfr_renamed_3971().cfr_renamed_186();
        sprpod4.cfr_renamed_93 = arg2;
        sprpod4.cfr_renamed_3 = arg3;
    }

    public sprsrd cfr_renamed_634() {
        return this.cfr_renamed_112;
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprvva cfr_renamed_3962(sprtzd arg0, String arg1) throws sprlqd {
        sprvte sprvte2 = this.cfr_renamed_574();
        if (sprvte2 != null && sprvte2.cfr_renamed_575(arg0).cfr_renamed_84() > 0) {
            throw new sprlqd(new StringBuilder().insert(0, sprixl.cfr_renamed_9("o'^o")).append(arg1).append(sprqzo.cfr_renamed_9("p*$?\"\"2>$.p\u0006\u0005\u0018\u0004k\u001e\u0004\u0004k2.p*>k%%#\"7%5/p*$?\"\"2>$.")).toString());
        }
        sprvte sprvte3 = this.cfr_renamed_619();
        if (sprvte3 == null) {
            return null;
        }
        sprlre sprlre2 = sprvte3.cfr_renamed_575(arg0);
        switch (sprlre2.cfr_renamed_84()) {
            case 0: {
                return null;
            }
            case 1: {
                sprere sprere2 = ((sprche)sprlre2.cfr_renamed_576(0)).cfr_renamed_206();
                if (sprere2.cfr_renamed_84() != 1) {
                    throw new sprlqd(new StringBuilder().insert(0, sprixl.cfr_renamed_9("zo")).append(arg1).append(sprqzo.cfr_renamed_9("k1?$99)%?5k\u001d\u001e\u0003\u001fp#1=5k1k#\">,<.p*$?\"\"2>$.p=1'%.")).toString());
                }
                return sprere2.cfr_renamed_85(0).cfr_renamed_119();
            }
        }
        throw new sprlqd(new StringBuilder().insert(0, sprixl.cfr_renamed_9("o'^oh&\\!^+z;O=R-N;^<\u001b&UoZoH&\\!^=r!] \u001b\u0002n\u001coou\u0000ooR!X#N+^oV:W;R?W*\u001b&U<O.U,^<\u001b ]oO'^o")).append(arg1).append(sprqzo.cfr_renamed_9("p*$?\"\"2>$.")).toString());
    }

    public static sprpod cfr_renamed_3974(sprpod arg0, sprwvd arg1) {
        Iterator iterator;
        sprpod sprpod2 = arg0;
        sprfve sprfve2 = sprpod2.cfr_renamed_0;
        sprvte sprvte2 = sprpod2.cfr_renamed_574();
        sprlre sprlre2 = sprvte2 != null ? sprvte2.cfr_renamed_3968() : new sprlre();
        sprlre sprlre3 = new sprlre();
        Iterator iterator2 = iterator = arg1.cfr_renamed_622().iterator();
        while (iterator2.hasNext()) {
            sprlre3.cfr_renamed_49(((sprpod)iterator.next()).cfr_renamed_568());
            iterator2 = iterator;
        }
        sprlre2.cfr_renamed_49(new sprche(sproi.cfr_renamed_2, new sprcwe(sprlre3)));
        sprpod sprpod3 = arg0;
        return new sprpod(new sprfve(sprfve2.cfr_renamed_634(), sprfve2.cfr_renamed_410(), sprfve2.cfr_renamed_3969(), sprfve2.cfr_renamed_3970(), sprfve2.cfr_renamed_3971(), new sprcwe(sprlre2)), sprpod3.cfr_renamed_1, sprpod3.cfr_renamed_93, null);
    }

    public sprwvd cfr_renamed_3975() {
        int n;
        sprvte sprvte2 = this.cfr_renamed_574();
        if (sprvte2 == null) {
            return new sprwvd(new ArrayList(0));
        }
        ArrayList<sprpod> arrayList = new ArrayList<sprpod>();
        sprlre sprlre2 = sprvte2.cfr_renamed_575(sproi.cfr_renamed_2);
        int n2 = n = 0;
        while (n2 < sprlre2.cfr_renamed_84()) {
            sprere sprere2 = ((sprche)sprlre2.cfr_renamed_576(n)).cfr_renamed_206();
            if (sprere2.cfr_renamed_84() < 1) {
                // empty if block
            }
            Enumeration enumeration = sprere2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                Enumeration enumeration2;
                Enumeration enumeration3 = enumeration2;
                enumeration = enumeration3;
                sprfve sprfve2 = sprfve.cfr_renamed_23(enumeration3.nextElement());
                arrayList.add(new sprpod(sprfve2, null, new sprard(this.cfr_renamed_79()), null));
            }
            n2 = ++n;
        }
        return new sprwvd(arrayList);
    }

    public byte[] cfr_renamed_79() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_152);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_0.cfr_renamed_3().cfr_renamed_97().intValue();
    }

    public sprfve cfr_renamed_568() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3697() {
        try {
            sprpod sprpod2 = this;
            return sprpod2.cfr_renamed_3956(sprpod2.cfr_renamed_132.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprixl.cfr_renamed_9("^7X*K;R Uo\\*O;R!\\o^!X=B?O&T!\u001b?Z=Z\"^;^=Ho")).append(exception).toString());
        }
    }

    public String cfr_renamed_3976() {
        return this.cfr_renamed_91.cfr_renamed_593().cfr_renamed_19();
    }
}

