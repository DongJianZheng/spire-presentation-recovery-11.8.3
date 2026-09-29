/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcoe;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprewd;
import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprhue;
import com.spire.presentation.packages.sprkpa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlya;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.spryje;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class sprerd {
    public static Collection cfr_renamed_4100(sprtzd arg0, spro arg1) {
        Iterator iterator;
        ArrayList<sprhse> arrayList = new ArrayList<sprhse>();
        Iterator iterator2 = iterator = arg1.cfr_renamed_152(null).iterator();
        while (iterator2.hasNext()) {
            spra spra2 = (spra)iterator.next();
            sprhue sprhue2 = new sprhue(arg0, spra2);
            iterator2 = iterator;
            sprerd.cfr_renamed_4101(sprhue2);
            arrayList.add(new sprhse(false, 1, sprhue2));
        }
        return arrayList;
    }

    public static byte[] cfr_renamed_4102(InputStream arg0, int arg1) throws IOException {
        return sprbsa.cfr_renamed_474(arg0, arg1);
    }

    public static InputStream cfr_renamed_4103(Collection arg0, InputStream arg1) {
        Iterator iterator;
        InputStream inputStream = arg1;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprpa sprpa2 = (sprpa)iterator.next();
            inputStream = new sprkpa(inputStream, sprpa2.cfr_renamed_470());
            iterator2 = iterator;
        }
        return inputStream;
    }

    public static sprnte cfr_renamed_4104(InputStream arg0) throws sprlqd {
        return sprerd.cfr_renamed_4105(new sprgle(arg0));
    }

    public static sprnte cfr_renamed_4106(byte[] arg0) throws sprlqd {
        return sprerd.cfr_renamed_4105(new sprgle(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List cfr_renamed_4107(spro arg0) throws sprlqd {
        ArrayList<sprhse> arrayList = new ArrayList<sprhse>();
        try {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_152(null).iterator();
            while (true) {
                if (!iterator2.hasNext()) {
                    return arrayList;
                }
                sproqd sproqd2 = (sproqd)iterator.next();
                iterator2 = iterator;
                arrayList.add(new sprhse(false, 2, sproqd2.cfr_renamed_568()));
            }
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprfdf.cfr_renamed_9("G!P<PsR!M0G Q:L4\u00020G!V "), classCastException);
        }
    }

    public static OutputStream cfr_renamed_4108(OutputStream arg0, int arg1, boolean arg2, int arg3) throws IOException {
        sprcoe sprcoe2 = new sprcoe(arg0, arg1, arg2);
        if (arg3 != 0) {
            return sprcoe2.cfr_renamed_4109(new byte[arg3]);
        }
        return sprcoe2.cfr_renamed_4110();
    }

    private static /* synthetic */ byte[] cfr_renamed_2400(char[] arg0) {
        if (arg0 != null) {
            return sprywa.cfr_renamed_432(arg0);
        }
        return new byte[0];
    }

    public static byte[] cfr_renamed_4009(int arg0, char[] arg1) {
        if (arg0 == 0) {
            return sprerd.cfr_renamed_1606(arg1);
        }
        return sprerd.cfr_renamed_2400(arg1);
    }

    public static List cfr_renamed_4015(spro arg0) throws sprlqd {
        ArrayList<sprkra> arrayList = new ArrayList<sprkra>();
        try {
            for (Object e : arg0.cfr_renamed_152(null)) {
                Object object;
                if (e instanceof spreud) {
                    object = (spreud)e;
                    arrayList.add(((spreud)object).cfr_renamed_568());
                    continue;
                }
                if (e instanceof sprhue) {
                    object = sprhue.cfr_renamed_23(e);
                    sprerd.cfr_renamed_4101((sprhue)object);
                    arrayList.add(new sprhse(false, 1, (spra)object));
                    continue;
                }
                if (!(e instanceof spryte)) continue;
                arrayList.add((sprkra)e);
            }
            return arrayList;
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprlya.cfr_renamed_9("cFt[t\u0014vFiWcGu]hS&WcFrG"), classCastException);
        }
    }

    public static OutputStream cfr_renamed_4111(Collection arg0, OutputStream arg1) {
        Iterator iterator;
        OutputStream outputStream = arg1;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprbod sprbod2 = (sprbod)iterator.next();
            outputStream = sprerd.cfr_renamed_4112(outputStream, sprbod2.cfr_renamed_3986());
            iterator2 = iterator;
        }
        return outputStream;
    }

    public static byte[] cfr_renamed_4002(InputStream arg0) throws IOException {
        return sprbsa.cfr_renamed_471(arg0);
    }

    public static OutputStream cfr_renamed_4112(OutputStream arg0, OutputStream arg1) {
        if (arg0 == null) {
            return sprerd.cfr_renamed_4113(arg1);
        }
        if (arg1 == null) {
            return sprerd.cfr_renamed_4113(arg0);
        }
        return new spruva(arg0, arg1);
    }

    public static OutputStream cfr_renamed_4113(OutputStream arg0) {
        if (arg0 == null) {
            return new sprewd();
        }
        return arg0;
    }

    private static /* synthetic */ void cfr_renamed_4101(sprhue arg0) {
        if (sprgl.cfr_renamed_86.equals(arg0.cfr_renamed_4114()) && spryje.cfr_renamed_23(arg0.cfr_renamed_3365()).cfr_renamed_4115().cfr_renamed_97().intValue() != 0) {
            throw new IllegalArgumentException(sprfdf.cfr_renamed_9("0C=L<VsC7FsW=Q&A0G Q5W?\u0002\u001ca\u0000rsP6Q#M=Q6\u0002'Msa\u001eqsq:E=G7f2V2"));
        }
    }

    public static sprere cfr_renamed_4116(List arg0) {
        Iterator iterator;
        sprlre sprlre2 = new sprlre();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprlre2.cfr_renamed_49((spra)iterator.next());
            iterator2 = iterator;
        }
        return new sprgve(sprlre2);
    }

    private static /* synthetic */ byte[] cfr_renamed_1606(char[] arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = new byte[arg0.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n++;
                byArray[n3] = (byte)arg0[n3];
                n2 = n;
            }
            return byArray;
        }
        return new byte[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprnte cfr_renamed_4105(sprgle arg0) throws sprlqd {
        try {
            return sprnte.cfr_renamed_23(arg0.cfr_renamed_24());
        }
        catch (IOException iOException) {
            throw new sprlqd(sprlya.cfr_renamed_9("O{CLeQv@o[h\u0014tQgPoZa\u0014e[h@cZr\u001a"), iOException);
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprfdf.cfr_renamed_9("o2N5M!O6FsA<L'G=V}"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprlya.cfr_renamed_9("KUjRiFkQb\u0014e[h@cZr\u001a"), illegalArgumentException);
        }
    }

    public static sprere cfr_renamed_4016(List arg0) {
        Iterator iterator;
        sprlre sprlre2 = new sprlre();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprlre2.cfr_renamed_49((spra)iterator.next());
            iterator2 = iterator;
        }
        return new sprcwe(sprlre2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List cfr_renamed_4014(spro arg0) throws sprlqd {
        ArrayList<sprcge> arrayList = new ArrayList<sprcge>();
        try {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_152(null).iterator();
            while (true) {
                if (!iterator2.hasNext()) {
                    return arrayList;
                }
                sprcyd sprcyd2 = (sprcyd)iterator.next();
                iterator2 = iterator;
                arrayList.add(sprcyd2.cfr_renamed_568());
            }
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprfdf.cfr_renamed_9("G!P<PsR!M0G Q:L4\u00020G!V "), classCastException);
        }
    }
}

