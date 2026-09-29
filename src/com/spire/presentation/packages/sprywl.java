/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprerl;
import com.spire.presentation.packages.spresy;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprium;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjsg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlnl;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sprmul;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprpy;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprwx;
import com.spire.presentation.packages.sprynl;
import com.spire.presentation.packages.sprypl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sprywl
implements sprjn {
    public sprsv cfr_renamed_119;
    private Map cfr_renamed_91;
    private static final sprynl cfr_renamed_0 = sprynl.cfr_renamed_4;
    public sprmul cfr_renamed_1;
    public sprmnm cfr_renamed_2;
    public sprlvm cfr_renamed_3;
    private static final sprcog cfr_renamed_4 = new sprcog();

    public sprsv cfr_renamed_623() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprywl(sprpy sprpy2, sprlvm sprlvm2) throws sprlyl {
        void arg1;
        sprywl sprywl2;
        void arg0;
        if (sprpy2 instanceof sprsv) {
            this.cfr_renamed_119 = (sprsv)arg0;
            sprywl2 = this;
        } else {
            sprywl2 = this;
            this.cfr_renamed_119 = new sprerl(this, (sprpy)arg0);
        }
        sprywl2.cfr_renamed_3 = arg1;
        this.cfr_renamed_2 = this.cfr_renamed_4151();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprywl(sprywl sprywl2) {
        void arg0;
        sprywl sprywl3 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprywl3.cfr_renamed_119 = v1.cfr_renamed_119;
        sprywl3.cfr_renamed_1 = sprywl2.cfr_renamed_1;
    }

    public Set<sprddm> cfr_renamed_10780() {
        Enumeration enumeration;
        HashSet<sprddm> hashSet = new HashSet<sprddm>(this.cfr_renamed_2.cfr_renamed_4139().cfr_renamed_84());
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.cfr_renamed_4139().cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            hashSet.add(sprddm.cfr_renamed_23(enumeration3.nextElement()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public sprywl(InputStream arg0) throws sprlyl {
        this(spreul.cfr_renamed_4104(arg0));
    }

    public sprug<sprpxl> cfr_renamed_633() {
        return cfr_renamed_0.cfr_renamed_10674(this.cfr_renamed_2.cfr_renamed_633());
    }

    public sprywl(Map arg0, byte[] arg1) throws sprlyl {
        this(arg0, spreul.cfr_renamed_4106(arg1));
    }

    public boolean cfr_renamed_10788() {
        return this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_480() == null && this.cfr_renamed_2.cfr_renamed_621().cfr_renamed_84() == 0;
    }

    public static sprywl cfr_renamed_10789(sprywl arg0, sprmul arg1) {
        return sprywl.cfr_renamed_10790(arg0, arg1, cfr_renamed_4);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2.cfr_renamed_3().cfr_renamed_5023();
    }

    public sprug<sprypl> cfr_renamed_618() {
        return cfr_renamed_0.cfr_renamed_10765(this.cfr_renamed_2.cfr_renamed_617());
    }

    public boolean cfr_renamed_10791() {
        return this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_480() == null && this.cfr_renamed_2.cfr_renamed_621().cfr_renamed_84() > 0;
    }

    public sprug<sprtpl> cfr_renamed_617() {
        return cfr_renamed_0.cfr_renamed_10675(this.cfr_renamed_2.cfr_renamed_617());
    }

    private /* synthetic */ boolean cfr_renamed_10792(sprrpl arg0, sprwx arg1) throws sprhjg, sprlyl {
        sprsvl sprsvl2 = arg1.cfr_renamed_10637(arg0.cfr_renamed_634());
        if (!arg0.cfr_renamed_5296(sprsvl2)) {
            return false;
        }
        Iterator<sprrpl> iterator = arg0.cfr_renamed_3975().cfr_renamed_622().iterator();
        while (iterator.hasNext()) {
            if (this.cfr_renamed_10792(iterator.next(), arg1)) continue;
            return false;
        }
        return true;
    }

    public sprywl(sprpy arg0, InputStream arg1) throws sprlyl {
        this(arg0, spreul.cfr_renamed_4104(new sprrzm(arg1)));
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public static sprywl cfr_renamed_10793(sprywl arg0, sprddm arg1) {
        int n;
        sprrvm sprrvm2;
        Iterator<sprddm> iterator;
        sprddm sprddm2;
        Set<sprddm> set = arg0.cfr_renamed_10780();
        if (set.contains(sprddm2 = sprynl.cfr_renamed_4.cfr_renamed_10756(arg1, cfr_renamed_4))) {
            return arg0;
        }
        sprywl sprywl2 = new sprywl(arg0);
        HashSet<sprddm> hashSet = new HashSet<sprddm>();
        Iterator<sprddm> iterator2 = iterator = set.iterator();
        while (iterator2.hasNext()) {
            hashSet.add(sprynl.cfr_renamed_4.cfr_renamed_10756(iterator.next(), cfr_renamed_4));
            iterator2 = iterator;
        }
        hashSet.add(sprddm2);
        spridn spridn2 = spreul.cfr_renamed_10757(hashSet);
        sprszm sprszm2 = (sprszm)arg0.cfr_renamed_2.cfr_renamed_119();
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(sprszm2.cfr_renamed_85(0));
        sprrvm3.cfr_renamed_5004(spridn2);
        int n2 = n = 2;
        while (n2 != sprszm2.cfr_renamed_84()) {
            sprrvm2.cfr_renamed_5004(sprszm2.cfr_renamed_85(n++));
            n2 = n;
        }
        sprywl2.cfr_renamed_2 = sprmnm.cfr_renamed_23(new sprqcn(sprrvm2));
        sprywl sprywl3 = sprywl2;
        sprywl2.cfr_renamed_3 = new sprlvm(sprywl2.cfr_renamed_3.cfr_renamed_696(), sprywl2.cfr_renamed_2);
        return sprywl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmnm cfr_renamed_4151() throws sprlyl {
        try {
            return sprmnm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_480());
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprjsg.cfr_renamed_9("i0H7K#I4@qG>J%A?P\u007f"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(spresy.cfr_renamed_9("u@TGWSUD\\\u0001[NVU]OL\u000f"), illegalArgumentException);
        }
    }

    public String cfr_renamed_620() {
        return this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_696().cfr_renamed_19();
    }

    public sprywl(byte[] arg0) throws sprlyl {
        this(spreul.cfr_renamed_4106(arg0));
    }

    public sprmul cfr_renamed_621() {
        if (this.cfr_renamed_1 == null) {
            int n;
            spridn spridn2 = this.cfr_renamed_2.cfr_renamed_621();
            ArrayList<sprrpl> arrayList = new ArrayList<sprrpl>();
            int n2 = n = 0;
            while (n2 != spridn2.cfr_renamed_84()) {
                sprium sprium2 = sprium.cfr_renamed_23(spridn2.cfr_renamed_85(n));
                sprywl sprywl2 = this;
                sprlem sprlem2 = sprywl2.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_696();
                if (sprywl2.cfr_renamed_91 == null) {
                    arrayList.add(new sprrpl(sprium2, sprlem2, this.cfr_renamed_119, null));
                } else {
                    byte[] byArray = this.cfr_renamed_91.keySet().iterator().next() instanceof String ? (byte[])this.cfr_renamed_91.get(sprium2.cfr_renamed_410().cfr_renamed_593().cfr_renamed_19()) : (byte[])this.cfr_renamed_91.get(sprium2.cfr_renamed_410().cfr_renamed_593());
                    arrayList.add(new sprrpl(sprium2, sprlem2, null, byArray));
                }
                n2 = ++n;
            }
            this.cfr_renamed_1 = new sprmul(arrayList);
        }
        return this.cfr_renamed_1;
    }

    public sprywl(sprpy arg0, byte[] arg1) throws sprlyl {
        this(arg0, spreul.cfr_renamed_4106(arg1));
    }

    public sprywl(Map arg0, sprlvm arg1) throws sprlyl {
        sprywl sprywl2 = this;
        this.cfr_renamed_91 = arg0;
        sprywl2.cfr_renamed_3 = arg1;
        sprywl2.cfr_renamed_2 = this.cfr_renamed_4151();
    }

    public boolean cfr_renamed_10794(sprwx arg0) throws sprlyl {
        return this.cfr_renamed_10795(arg0, false);
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        return this.cfr_renamed_3.cfr_renamed_104(arg0);
    }

    public sprug cfr_renamed_10784(sprlem arg0) {
        return cfr_renamed_0.cfr_renamed_10763(arg0, this.cfr_renamed_2.cfr_renamed_633());
    }

    public boolean cfr_renamed_10795(sprwx arg0, boolean arg1) throws sprlyl {
        for (sprrpl sprrpl2 : this.cfr_renamed_621().cfr_renamed_622()) {
            block5: {
                sprsvl sprsvl2 = arg0.cfr_renamed_10637(sprrpl2.cfr_renamed_634());
                if (sprrpl2.cfr_renamed_5296(sprsvl2)) break block5;
                return false;
            }
            try {
                if (arg1) continue;
                Iterator<sprrpl> iterator = sprrpl2.cfr_renamed_3975().cfr_renamed_622().iterator();
                while (iterator.hasNext()) {
                    if (this.cfr_renamed_10792(iterator.next(), arg0)) continue;
                    return false;
                }
            }
            catch (sprhjg sprhjg2) {
                throw new sprlyl(new StringBuilder().insert(0, sprjsg.cfr_renamed_9("B0M=Q#AqM?\u0004'A#M7M4VqT#K'M5A#\u001eq")).append(sprhjg2.getMessage()).toString(), sprhjg2);
            }
        }
        return true;
    }

    public static sprywl cfr_renamed_10796(sprywl arg0, sprug arg1, sprug arg2, sprug arg3) throws sprlyl {
        Iterable iterable;
        sprywl sprywl2 = new sprywl(arg0);
        spridn spridn2 = null;
        Iterable iterable2 = null;
        if (arg1 != null || arg2 != null) {
            spridn spridn3;
            iterable = new ArrayList();
            if (arg1 != null) {
                iterable.addAll(spreul.cfr_renamed_10676(arg1));
            }
            if (arg2 != null) {
                iterable.addAll(spreul.cfr_renamed_10760(arg2));
            }
            if ((spridn3 = spreul.cfr_renamed_4116(iterable)).cfr_renamed_84() != 0) {
                spridn2 = spridn3;
            }
        }
        if (arg3 != null && ((spridn)(iterable = spreul.cfr_renamed_4116(spreul.cfr_renamed_10677(arg3)))).cfr_renamed_84() != 0) {
            iterable2 = iterable;
        }
        sprywl2.cfr_renamed_2 = new sprmnm(arg0.cfr_renamed_2.cfr_renamed_4139(), arg0.cfr_renamed_2.cfr_renamed_2589(), spridn2, (spridn)iterable2, arg0.cfr_renamed_2.cfr_renamed_621());
        sprywl sprywl3 = sprywl2;
        sprywl2.cfr_renamed_3 = new sprlvm(sprywl2.cfr_renamed_3.cfr_renamed_696(), sprywl2.cfr_renamed_2);
        return sprywl2;
    }

    public static sprywl cfr_renamed_10790(sprywl arg0, sprmul arg1, sprve arg2) {
        int n;
        Object object;
        Iterator<sprrpl> iterator;
        sprywl sprywl2 = new sprywl(arg0);
        new sprywl(arg0).cfr_renamed_1 = arg1;
        HashSet<sprddm> hashSet = new HashSet<sprddm>();
        sprrvm sprrvm2 = new sprrvm();
        Iterator<sprrpl> iterator2 = iterator = arg1.cfr_renamed_622().iterator();
        while (iterator2.hasNext()) {
            object = iterator.next();
            iterator2 = iterator;
            Object object2 = object;
            spreul.cfr_renamed_10755(hashSet, (sprrpl)object2, arg2);
            sprrvm2.cfr_renamed_5004(((sprrpl)object2).cfr_renamed_568());
        }
        object = spreul.cfr_renamed_10757(hashSet);
        sprsgn sprsgn2 = new sprsgn(sprrvm2);
        sprszm sprszm2 = (sprszm)arg0.cfr_renamed_2.cfr_renamed_119();
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(sprszm2.cfr_renamed_85(0));
        sprrvm3.cfr_renamed_5004((sprco)object);
        int n2 = n = 2;
        while (n2 != sprszm2.cfr_renamed_84() - 1) {
            sprrvm2.cfr_renamed_5004(sprszm2.cfr_renamed_85(n++));
            n2 = n;
        }
        sprrvm2.cfr_renamed_5004(sprsgn2);
        sprywl sprywl3 = sprywl2;
        sprywl2.cfr_renamed_2 = sprmnm.cfr_renamed_23(new sprqcn(sprrvm2));
        sprywl3.cfr_renamed_3 = new sprlvm(sprywl2.cfr_renamed_3.cfr_renamed_696(), sprywl2.cfr_renamed_2);
        return sprywl2;
    }

    public sprywl(sprlvm arg0) throws sprlyl {
        sprywl sprywl2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = sprywl2.cfr_renamed_4151();
        sprco sprco2 = this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_480();
        if (sprco2 != null) {
            if (sprco2 instanceof sproug) {
                sprywl sprywl3 = this;
                this.cfr_renamed_119 = new spraql(this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_696(), ((sproug)sprco2).cfr_renamed_186());
                return;
            }
            this.cfr_renamed_119 = new sprlnl(this.cfr_renamed_2.cfr_renamed_2589().cfr_renamed_696(), sprco2);
            return;
        }
        this.cfr_renamed_119 = null;
    }

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }
}

