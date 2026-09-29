/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprate;
import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprhme;
import com.spire.presentation.packages.sprhoe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprhvd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprone;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprpue;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.sprzwq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprnpd
extends spruua {
    private sprere cfr_renamed_152;
    private Map cfr_renamed_112;
    private sprwvd cfr_renamed_119;
    private sprhvd cfr_renamed_91;
    private sprere cfr_renamed_0;
    private static final spraud cfr_renamed_1 = spraud.cfr_renamed_3;
    private sprhme cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprhvd cfr_renamed_623() {
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        InputStream inputStream = sprerd.cfr_renamed_4103(this.cfr_renamed_112.values(), this.cfr_renamed_91.cfr_renamed_4004());
        return new sprhvd(this.cfr_renamed_91.cfr_renamed_696(), inputStream);
    }

    public sprnpd(spraa arg0, byte[] arg1) throws sprlqd {
        this(arg0, new ByteArrayInputStream(arg1));
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2.cfr_renamed_3().cfr_renamed_97().intValue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnpd(spraa arg0, sprhvd arg1, InputStream arg2) throws sprlqd {
        super(arg2);
        try {
            v0 = this;
            v0.cfr_renamed_91 = arg1;
            v0.cfr_renamed_2 = sprhme.cfr_renamed_23(v0.cfr_renamed_4.cfr_renamed_697(16));
            v1 = this;
            v0.cfr_renamed_112 = new HashMap<K, V>();
            var4_4 = v0.cfr_renamed_2.cfr_renamed_4139();
            while ((var5_6 = var4_4.cfr_renamed_24()) != null) {
                var6_7 = sprije.cfr_renamed_23(var5_6);
                try {
                    var7_8 = arg0.cfr_renamed_578((sprije)var6_7);
                    if (var7_8 == null) continue;
                    this.cfr_renamed_112.put(var6_7.cfr_renamed_593(), var7_8);
                }
                catch (sprfya var7_9) {}
            }
            var6_7 = this.cfr_renamed_2.cfr_renamed_2589();
            var7_8 = (sprwf)var6_7.cfr_renamed_697(4);
            if (var7_8 == null) ** GOTO lbl30
            var8_10 = new sprhvd(var6_7.cfr_renamed_696().cfr_renamed_19(), var7_8.cfr_renamed_698());
            if (this.cfr_renamed_91 == null) {
                v2 = arg1;
                this.cfr_renamed_91 = var8_10;
            } else {
                var8_10.cfr_renamed_4117();
lbl30:
                // 2 sources

                v2 = arg1;
            }
            if (v2 == null) {
                this.cfr_renamed_4 = var6_7.cfr_renamed_696();
                return;
            }
            this.cfr_renamed_4 = this.cfr_renamed_91.cfr_renamed_696();
            return;
        }
        catch (IOException var4_5) {
            throw new sprlqd(new StringBuilder().insert(0, sprmpd.cfr_renamed_9("M@\u0004J\\LA_PFKA\u001e\u000f")).append(var4_5.getMessage()).toString(), var4_5);
        }
    }

    private static /* synthetic */ sprere cfr_renamed_4140(sprbl arg0) {
        if (arg0 == null) {
            return null;
        }
        return sprere.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    private static /* synthetic */ void cfr_renamed_4141(sprgre arg0, OutputStream arg1) throws IOException {
        sprwf sprwf2 = (sprwf)arg0.cfr_renamed_697(4);
        if (sprwf2 != null) {
            sprnpd.cfr_renamed_4142(sprwf2, arg1);
        }
    }

    public sprnpd(spraa arg0, sprhvd arg1, byte[] arg2) throws sprlqd {
        this(arg0, arg1, new ByteArrayInputStream(arg2));
    }

    public spro cfr_renamed_617() throws sprlqd {
        this.cfr_renamed_4143();
        return cfr_renamed_1.cfr_renamed_4119(this.cfr_renamed_0);
    }

    public static OutputStream cfr_renamed_4144(InputStream arg0, spro arg1, spro arg2, spro arg3, OutputStream arg4) throws sprlqd, IOException {
        Object object;
        sprhoe sprhoe2;
        sprkwe sprkwe2 = new sprkwe(arg0);
        sprhme sprhme2 = sprhme.cfr_renamed_23(new sprgre((sprao)sprkwe2.cfr_renamed_24()).cfr_renamed_697(16));
        sprhoe sprhoe3 = new sprhoe(arg4);
        sprhoe3.cfr_renamed_4133(sprgl.cfr_renamed_3);
        sprhoe sprhoe4 = new sprhoe(sprhoe3.cfr_renamed_4134(), 0, true);
        sprhme sprhme3 = sprhme2;
        sprhoe4.cfr_renamed_4133(sprhme3.cfr_renamed_3());
        sprhme sprhme4 = sprhme2;
        sprhoe4.cfr_renamed_4134().write(sprhme4.cfr_renamed_4139().cfr_renamed_119().cfr_renamed_91());
        sprgre sprgre2 = sprhme3.cfr_renamed_2589();
        sprhoe sprhoe5 = sprhoe2 = new sprhoe(sprhoe4.cfr_renamed_4134());
        sprhoe5.cfr_renamed_4133(sprgre2.cfr_renamed_696());
        sprnpd.cfr_renamed_4141(sprgre2, sprhoe5.cfr_renamed_4134());
        sprhoe5.cfr_renamed_2637();
        sprnpd.cfr_renamed_4140(sprhme4.cfr_renamed_617());
        sprnpd.cfr_renamed_4140(sprhme2.cfr_renamed_4145());
        if (arg1 != null || arg3 != null) {
            sprere sprere2;
            object = new ArrayList();
            if (arg1 != null) {
                object.addAll(sprerd.cfr_renamed_4014(arg1));
            }
            if (arg3 != null) {
                object.addAll(sprerd.cfr_renamed_4107(arg3));
            }
            if ((sprere2 = sprerd.cfr_renamed_4116((List)object)).cfr_renamed_84() > 0) {
                sprhoe4.cfr_renamed_4134().write(new sprhse(0 != 0, 0, sprere2).cfr_renamed_91());
            }
        }
        if (arg2 != null && ((sprere)(object = sprerd.cfr_renamed_4116(sprerd.cfr_renamed_4015(arg2)))).cfr_renamed_84() > 0) {
            sprhoe4.cfr_renamed_4134().write(new sprhse(false, 1, (spra)object).cfr_renamed_91());
        }
        sprhoe sprhoe6 = sprhoe4;
        sprhoe6.cfr_renamed_4134().write(sprhme2.cfr_renamed_621().cfr_renamed_119().cfr_renamed_91());
        sprhoe6.cfr_renamed_2637();
        sprhoe3.cfr_renamed_2637();
        return arg4;
    }

    public spro cfr_renamed_4146(sprtzd arg0) throws sprlqd {
        this.cfr_renamed_4143();
        return cfr_renamed_1.cfr_renamed_4118(arg0, this.cfr_renamed_152);
    }

    public sprnpd(spraa arg0, InputStream arg1) throws sprlqd {
        this(arg0, null, arg1);
    }

    public static OutputStream cfr_renamed_4147(InputStream arg0, sprwvd arg1, OutputStream arg2) throws sprlqd, IOException {
        Iterator iterator;
        Object object;
        sprkwe sprkwe2 = new sprkwe(arg0);
        sprhme sprhme2 = sprhme.cfr_renamed_23(new sprgre((sprao)sprkwe2.cfr_renamed_24()).cfr_renamed_697(16));
        sprhoe sprhoe2 = new sprhoe(arg2);
        sprhoe2.cfr_renamed_4133(sprgl.cfr_renamed_3);
        sprhoe sprhoe3 = new sprhoe(sprhoe2.cfr_renamed_4134(), 0, true);
        sprhme sprhme3 = sprhme2;
        sprhoe3.cfr_renamed_4133(sprhme3.cfr_renamed_3());
        sprhme3.cfr_renamed_4139().cfr_renamed_119();
        sprlre sprlre2 = new sprlre();
        Object object2 = arg1.cfr_renamed_622().iterator();
        Iterator iterator2 = object2;
        while (iterator2.hasNext()) {
            object = (sprpod)object2.next();
            iterator2 = object2;
            sprlre2.cfr_renamed_49(spraud.cfr_renamed_3.cfr_renamed_4122(((sprpod)object).cfr_renamed_3960()));
        }
        sprhme sprhme4 = sprhme2;
        sprhoe sprhoe4 = sprhoe3;
        sprhoe4.cfr_renamed_4134().write(new sprcwe(sprlre2).cfr_renamed_91());
        object2 = sprhme4.cfr_renamed_2589();
        Object object3 = object = new sprhoe(sprhoe3.cfr_renamed_4134());
        ((sprhoe)object3).cfr_renamed_4133(((sprgre)object2).cfr_renamed_696());
        sprnpd.cfr_renamed_4141((sprgre)object2, ((sprpue)object3).cfr_renamed_4134());
        ((sprhoe)object3).cfr_renamed_2637();
        sprnpd.cfr_renamed_4148(sprhoe4, sprhme4.cfr_renamed_617(), 0);
        sprnpd.cfr_renamed_4148(sprhoe3, sprhme2.cfr_renamed_4145(), 1);
        sprlre sprlre3 = new sprlre();
        Iterator iterator3 = iterator = arg1.cfr_renamed_622().iterator();
        while (iterator3.hasNext()) {
            sprpod sprpod2 = (sprpod)iterator.next();
            iterator3 = iterator;
            sprlre3.cfr_renamed_49(sprpod2.cfr_renamed_568());
        }
        sprhoe sprhoe5 = sprhoe3;
        sprhoe5.cfr_renamed_4134().write(new sprcwe(sprlre3).cfr_renamed_91());
        sprhoe5.cfr_renamed_2637();
        sprhoe2.cfr_renamed_2637();
        return arg2;
    }

    public sprwvd cfr_renamed_621() throws sprlqd {
        if (this.cfr_renamed_119 == null) {
            Object object;
            Iterator iterator;
            sprnpd sprnpd2 = this;
            sprnpd2.cfr_renamed_4143();
            ArrayList<sprpod> arrayList = new ArrayList<sprpod>();
            HashMap<Object, byte[]> hashMap = new HashMap<Object, byte[]>();
            Iterator iterator2 = iterator = sprnpd2.cfr_renamed_112.keySet().iterator();
            while (iterator2.hasNext()) {
                Object object2 = object = iterator.next();
                hashMap.put(object2, ((sprpa)this.cfr_renamed_112.get(object2)).cfr_renamed_580());
                iterator2 = iterator;
            }
            try {
                spra spra2;
                object = this.cfr_renamed_2.cfr_renamed_621();
                while ((spra2 = object.cfr_renamed_24()) != null) {
                    sprfve sprfve2 = sprfve.cfr_renamed_23(spra2.cfr_renamed_119());
                    byte[] byArray = (byte[])hashMap.get(sprfve2.cfr_renamed_410().cfr_renamed_593());
                    arrayList.add(new sprpod(sprfve2, this.cfr_renamed_4, null, byArray));
                }
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprzwq.cfr_renamed_9("6l\u007ff'`:s+j0me#")).append(iOException.getMessage()).toString(), iOException);
            }
            this.cfr_renamed_119 = new sprwvd(arrayList);
        }
        return this.cfr_renamed_119;
    }

    public String cfr_renamed_620() {
        return this.cfr_renamed_4.cfr_renamed_19();
    }

    public spro cfr_renamed_618() throws sprlqd {
        this.cfr_renamed_4143();
        return cfr_renamed_1.cfr_renamed_4120(this.cfr_renamed_0);
    }

    private static /* synthetic */ void cfr_renamed_4142(sprwf arg0, OutputStream arg1) throws IOException {
        OutputStream outputStream;
        OutputStream outputStream2 = outputStream = sprerd.cfr_renamed_4108(arg1, 0, true, 0);
        sprbsa.cfr_renamed_472(arg0.cfr_renamed_698(), outputStream2);
        outputStream2.close();
    }

    public spro cfr_renamed_633() throws sprlqd {
        this.cfr_renamed_4143();
        return cfr_renamed_1.cfr_renamed_4121(this.cfr_renamed_152);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4143() throws sprlqd {
        if (this.cfr_renamed_3) {
            return;
        }
        this.cfr_renamed_3 = true;
        try {
            sprnpd sprnpd2 = this;
            sprnpd2.cfr_renamed_0 = sprnpd.cfr_renamed_4140(sprnpd2.cfr_renamed_2.cfr_renamed_617());
            sprnpd2.cfr_renamed_152 = sprnpd.cfr_renamed_4140(sprnpd2.cfr_renamed_2.cfr_renamed_4145());
            return;
        }
        catch (IOException iOException) {
            throw new sprlqd(sprmpd.cfr_renamed_9("_V@FCAB\u0004_E]WFJH\u0004LA]P\u0000G]H\u000fWJP\\"), iOException);
        }
    }

    private static /* synthetic */ void cfr_renamed_4148(sprate arg0, sprbl arg1, int arg2) throws IOException {
        sprere sprere2 = sprnpd.cfr_renamed_4140(arg1);
        if (sprere2 != null) {
            if (arg1 instanceof sprone) {
                arg0.cfr_renamed_4134().write(new sprdpe(false, arg2, sprere2).cfr_renamed_91());
                return;
            }
            arg0.cfr_renamed_4134().write(new sprhse(false, arg2, sprere2).cfr_renamed_91());
        }
    }
}

