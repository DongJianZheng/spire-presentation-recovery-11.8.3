/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcpl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdkm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdoe;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhaj;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsfn;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprvsr;
import com.spire.presentation.packages.sprxxl;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprynl;
import com.spire.presentation.packages.sprypl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class spreul {
    private static final Set cfr_renamed_1;
    private static final Set cfr_renamed_2;
    private static final Set cfr_renamed_3;
    private static final Set<String> cfr_renamed_4;

    public static void cfr_renamed_10755(Set<sprddm> arg0, sprrpl arg1, sprve arg2) {
        arg0.add(sprynl.cfr_renamed_4.cfr_renamed_10756(arg1.cfr_renamed_3960(), arg2));
        Iterator<sprrpl> iterator = arg1.cfr_renamed_3975().iterator();
        Iterator<sprrpl> iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprrpl sprrpl2 = iterator.next();
            iterator2 = iterator;
            arg0.add(sprynl.cfr_renamed_4.cfr_renamed_10756(sprrpl2.cfr_renamed_3960(), arg2));
        }
    }

    public static spridn cfr_renamed_10757(Set<sprddm> arg0) {
        Set<sprddm> set = arg0;
        return new sprsgn(set.toArray(new sprddm[set.size()]));
    }

    public static OutputStream cfr_renamed_4111(Collection arg0, OutputStream arg1) {
        Iterator iterator;
        OutputStream outputStream = arg1;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprxxl sprxxl2 = (sprxxl)iterator.next();
            outputStream = spreul.cfr_renamed_4112(outputStream, sprxxl2.cfr_renamed_3986());
            iterator2 = iterator;
        }
        return outputStream;
    }

    static {
        cfr_renamed_4 = new HashSet<String>();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_1 = new HashSet();
        cfr_renamed_4.add("DES");
        cfr_renamed_4.add(sprvsr.cfr_renamed_9("N Y N "));
        cfr_renamed_4.add(sprgt.cfr_renamed_2.cfr_renamed_19());
        cfr_renamed_4.add(sprdl.cfr_renamed_2797.cfr_renamed_19());
        cfr_renamed_4.add(sprdl.cfr_renamed_152.cfr_renamed_19());
        cfr_renamed_3.add(sprbr.cfr_renamed_96);
        cfr_renamed_3.add(sprhr.cfr_renamed_96);
        cfr_renamed_3.add(sprhr.cfr_renamed_955);
        cfr_renamed_3.add(sprhr.cfr_renamed_723);
        cfr_renamed_3.add(sprhr.cfr_renamed_135);
        cfr_renamed_2.add(sprbr.cfr_renamed_137);
        cfr_renamed_2.add(sprbr.cfr_renamed_725);
        cfr_renamed_2.add(sprhr.cfr_renamed_31);
        cfr_renamed_2.add(sprhr.cfr_renamed_952);
        cfr_renamed_2.add(sprhr.cfr_renamed_1226);
        cfr_renamed_2.add(sprhr.cfr_renamed_86);
        cfr_renamed_2.add(sprhr.cfr_renamed_119);
        cfr_renamed_2.add(sprhr.cfr_renamed_499);
        cfr_renamed_2.add(sprhr.cfr_renamed_126);
        cfr_renamed_2.add(sprhr.cfr_renamed_1228);
        cfr_renamed_1.add(sprqo.cfr_renamed_82);
        cfr_renamed_1.add(sprdt.cfr_renamed_79);
        cfr_renamed_1.add(sprdt.cfr_renamed_93);
    }

    public static boolean cfr_renamed_7452(sprlem arg0) {
        return cfr_renamed_1.contains(arg0);
    }

    public static spridn cfr_renamed_4016(List arg0) {
        Iterator iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprrvm2.cfr_renamed_5004((sprco)iterator.next());
            iterator2 = iterator;
        }
        return new sprocn(sprrvm2);
    }

    public static sprlvm cfr_renamed_4104(InputStream arg0) throws sprlyl {
        return spreul.cfr_renamed_10758(new sprrzm(arg0));
    }

    public static byte[] cfr_renamed_4102(InputStream arg0, int arg1) throws IOException {
        return sprkqe.cfr_renamed_474(arg0, arg1);
    }

    public static void cfr_renamed_10759(sprdkm arg0) {
        sprmom sprmom2;
        if (sprgz.cfr_renamed_132.cfr_renamed_5078(arg0.cfr_renamed_4114()) && 0 != (sprmom2 = sprmom.cfr_renamed_23(arg0.cfr_renamed_3365())).cfr_renamed_4115().cfr_renamed_9108()) {
            throw new IllegalArgumentException(sprhaj.cfr_renamed_9("\n\u0010\u0007\u001f\u0006\u0005I\u0010\r\u0015I\u0004\u0007\u0002\u001c\u0012\n\u0014\u001a\u0002\u000f\u0004\u0005Q&2:!I\u0003\f\u0002\u0019\u001e\u0007\u0002\fQ\u001d\u001eI2$\"I\"\u0000\u0016\u0007\u0014\r5\b\u0005\b"));
        }
    }

    public static boolean cfr_renamed_10716(sprlem arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    public static boolean cfr_renamed_9390(String arg0) {
        String string = sprkoe.cfr_renamed_116(arg0);
        return cfr_renamed_4.contains(string);
    }

    public static boolean cfr_renamed_10718(sprlem arg0) {
        return arg0.cfr_renamed_5078(sprdl.cfr_renamed_1575) || arg0.cfr_renamed_5078(sprdl.cfr_renamed_1596);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List cfr_renamed_10760(sprug arg0) throws sprlyl {
        ArrayList<sprycn> arrayList = new ArrayList<sprycn>();
        try {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_3216(null).iterator();
            while (true) {
                if (!iterator2.hasNext()) {
                    return arrayList;
                }
                sprypl sprypl2 = (sprypl)iterator.next();
                iterator2 = iterator;
                arrayList.add(new sprycn(false, 2, (sprco)sprypl2.cfr_renamed_568()));
            }
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprvsr.cfr_renamed_9("o\u0017x\nxEz\u0017e\u0006o\u0016y\fd\u0002*\u0006o\u0017~\u0016"), classCastException);
        }
    }

    public static boolean cfr_renamed_10717(sprlem arg0) {
        return cfr_renamed_2.contains(arg0);
    }

    public static spridn cfr_renamed_10761(List arg0) {
        Iterator iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprrvm2.cfr_renamed_5004((sprco)iterator.next());
            iterator2 = iterator;
        }
        return new sprsgn(sprrvm2);
    }

    public static sprlvm cfr_renamed_4106(byte[] arg0) throws sprlyl {
        return spreul.cfr_renamed_10758(new sprrzm(arg0));
    }

    public static OutputStream cfr_renamed_4112(OutputStream arg0, OutputStream arg1) {
        if (arg0 == null) {
            return spreul.cfr_renamed_4113(arg1);
        }
        if (arg1 == null) {
            return spreul.cfr_renamed_4113(arg0);
        }
        return new sprmve(arg0, arg1);
    }

    public static InputStream cfr_renamed_4103(Collection arg0, InputStream arg1) {
        Iterator iterator;
        InputStream inputStream = arg1;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprjj sprjj2 = (sprjj)iterator.next();
            inputStream = new sprdoe(inputStream, sprjj2.cfr_renamed_470());
            iterator2 = iterator;
        }
        return inputStream;
    }

    public static boolean cfr_renamed_10642(sprddm arg0, sprddm arg1) {
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (!arg0.cfr_renamed_593().cfr_renamed_5078(arg1.cfr_renamed_593())) {
            return false;
        }
        sprco sprco2 = arg0.cfr_renamed_284();
        sprco sprco3 = arg1.cfr_renamed_284();
        if (sprco2 != null) {
            return sprco2.equals(sprco3) || sprco2.equals(sprpen.cfr_renamed_4) && sprco3 == null;
        }
        return sprco3 == null || sprco3.equals(sprpen.cfr_renamed_4);
    }

    public static byte[] cfr_renamed_4002(InputStream arg0) throws IOException {
        return sprkqe.cfr_renamed_471(arg0);
    }

    public static OutputStream cfr_renamed_4108(OutputStream arg0, int arg1, boolean arg2, int arg3) throws IOException {
        sprsfn sprsfn2 = new sprsfn(arg0, arg1, arg2);
        if (arg3 != 0) {
            return sprsfn2.cfr_renamed_4109(new byte[arg3]);
        }
        return sprsfn2.cfr_renamed_4110();
    }

    public static OutputStream cfr_renamed_4113(OutputStream arg0) {
        if (arg0 == null) {
            return new sprcpl();
        }
        return arg0;
    }

    public static spridn cfr_renamed_4116(List arg0) {
        Iterator iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprrvm2.cfr_renamed_5004((sprco)iterator.next());
            iterator2 = iterator;
        }
        return new sprufn(sprrvm2);
    }

    public static Collection cfr_renamed_10762(sprlem arg0, sprug arg1) {
        Iterator iterator;
        ArrayList<sprycn> arrayList = new ArrayList<sprycn>();
        Iterator iterator2 = iterator = arg1.cfr_renamed_3216(null).iterator();
        while (iterator2.hasNext()) {
            sprco sprco2 = (sprco)iterator.next();
            sprdkm sprdkm2 = new sprdkm(arg0, sprco2);
            iterator2 = iterator;
            spreul.cfr_renamed_10759(sprdkm2);
            arrayList.add(new sprycn(false, 1, (sprco)sprdkm2));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprlvm cfr_renamed_10758(sprrzm arg0) throws sprlyl {
        try {
            sprlvm sprlvm2 = sprlvm.cfr_renamed_23(arg0.cfr_renamed_24());
            if (sprlvm2 == null) {
                throw new sprlyl(sprhaj.cfr_renamed_9("'\u001eI\u0012\u0006\u001f\u001d\u0014\u0007\u0005I\u0017\u0006\u0004\u0007\u0015G"));
            }
            return sprlvm2;
        }
        catch (IOException iOException) {
            throw new sprlyl(sprvsr.cfr_renamed_9("C*O\u001di\u0000z\u0011c\ndEx\u0000k\u0001c\u000bmEi\nd\u0011o\u000b~K"), iOException);
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprhaj.cfr_renamed_9("<\b\u001d\u000f\u001e\u001b\u001c\f\u0015I\u0012\u0006\u001f\u001d\u0014\u0007\u0005G"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(sprvsr.cfr_renamed_9("G\u0004f\u0003e\u0017g\u0000nEi\nd\u0011o\u000b~K"), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List cfr_renamed_10676(sprug arg0) throws sprlyl {
        ArrayList<sprndm> arrayList = new ArrayList<sprndm>();
        try {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_3216(null).iterator();
            while (true) {
                if (!iterator2.hasNext()) {
                    return arrayList;
                }
                sprtpl sprtpl2 = (sprtpl)iterator.next();
                iterator2 = iterator;
                arrayList.add(sprtpl2.cfr_renamed_568());
            }
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprhaj.cfr_renamed_9("\u0014\u001b\u0003\u0006\u0003I\u0001\u001b\u001e\n\u0014\u001a\u0002\u0000\u001f\u000eQ\n\u0014\u001b\u0005\u001a"), classCastException);
        }
    }

    public static List cfr_renamed_10677(sprug arg0) throws sprlyl {
        ArrayList<sprqqe> arrayList = new ArrayList<sprqqe>();
        try {
            for (Object t : arg0.cfr_renamed_3216(null)) {
                sprjn sprjn2;
                if (t instanceof sprpxl) {
                    sprjn2 = (sprpxl)t;
                    arrayList.add(sprjn2.cfr_renamed_568());
                    continue;
                }
                if (t instanceof sprdkm) {
                    sprjn2 = sprdkm.cfr_renamed_23(t);
                    spreul.cfr_renamed_10759((sprdkm)sprjn2);
                    arrayList.add(new sprycn(false, 1, (sprco)((Object)sprjn2)));
                    continue;
                }
                if (!(t instanceof sprnvm)) continue;
                arrayList.add((sprqqe)t);
            }
            return arrayList;
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprvsr.cfr_renamed_9("o\u0017x\nxEz\u0017e\u0006o\u0016y\fd\u0002*\u0006o\u0017~\u0016"), classCastException);
        }
    }
}

