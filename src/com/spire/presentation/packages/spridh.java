/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmh;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmdh;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvhh;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprxll;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;

public class spridh
extends OutputStream {
    private static final int[] cfr_renamed_2;
    private final OutputStream cfr_renamed_3;
    public PrintWriter cfr_renamed_4;

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_3.write(arg0);
    }

    public void cfr_renamed_8104(String arg0) {
        if (this.cfr_renamed_4 != null) {
            int n;
            StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
            int n2 = -1;
            int n3 = n = 0;
            while (n3 != stackTraceElementArray.length) {
                StackTraceElement stackTraceElement = stackTraceElementArray[n];
                if (stackTraceElement.getMethodName().equals(sprjgba.cfr_renamed_9("yv\u007ffzCozsg"))) {
                    n2 = 0;
                } else if (stackTraceElement.getClassName().contains(sprxll.cfr_renamed_9("\u001b\u0015\u0006\u0019: !$"))) {
                    ++n2;
                }
                n3 = ++n;
            }
            int n4 = n2;
            while (n4 > 0) {
                this.cfr_renamed_4.append("    ");
                n4 = --n2;
            }
            this.cfr_renamed_4.append(arg0).append("\n");
            this.cfr_renamed_4.flush();
        }
    }

    public void cfr_renamed_8105(sprco arg0, sprvlh arg1) throws IOException {
        spridh spridh2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        spridh spridh3 = spridh2 = new spridh(byteArrayOutputStream);
        spridh3.cfr_renamed_8106(arg0, arg1);
        spridh3.flush();
        spridh3.close();
        spridh spridh4 = this;
        spridh4.cfr_renamed_8107(byteArrayOutputStream.size());
        spridh4.write(byteArrayOutputStream.toByteArray());
    }

    public spridh(OutputStream outputStream) {
        spridh spridh2 = this;
        spridh2.cfr_renamed_4 = null;
        spridh2.cfr_renamed_3 = outputStream;
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        cfr_renamed_2 = nArray;
    }

    private /* synthetic */ void cfr_renamed_8108(long arg0) throws IOException {
        byte[] byArray = sprhdf.cfr_renamed_514(BigInteger.valueOf(arg0));
        this.cfr_renamed_3.write(byArray.length);
        this.cfr_renamed_3.write(byArray);
    }

    private /* synthetic */ void cfr_renamed_8107(long arg0) throws IOException {
        if (arg0 <= 127L) {
            this.cfr_renamed_3.write((int)arg0);
            return;
        }
        byte[] byArray = sprhdf.cfr_renamed_514(BigInteger.valueOf(arg0));
        this.cfr_renamed_3.write(byArray.length | 0x80);
        this.cfr_renamed_3.write(byArray);
    }

    /*
     * Unable to fully structure code
     */
    public void cfr_renamed_8106(sprco arg0, sprvlh arg1) throws IOException {
        if (arg0 == sprenh.cfr_renamed_3) {
            return;
        }
        if (arg0 instanceof sprenh) {
            this.cfr_renamed_8106(((sprenh)arg0).cfr_renamed_1397(), arg1);
            return;
        }
        arg0 = arg0.cfr_renamed_119();
        switch (sprmdh.cfr_renamed_4[arg1.cfr_renamed_8109().ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                this.cfr_renamed_8106(arg0, arg1.cfr_renamed_8110().cfr_renamed_1451());
                return;
            }
            case 2: {
                var3_3 = sprszm.cfr_renamed_23(arg0);
                var4_5 = 7;
                var5_7 = 0;
                var6_18 = false;
                if (!arg1.cfr_renamed_8111()) ** GOTO lbl33
                v0 = var7_27 = 0;
                while (v0 < arg1.cfr_renamed_8112().size()) {
                    var8_35 = arg1.cfr_renamed_8112().get(var7_27);
                    if (var8_35.cfr_renamed_8109() != sprvhh.cfr_renamed_1) ** GOTO lbl24
                    v1 = var6_18;
                    ** GOTO lbl30
lbl24:
                    // 1 sources

                    if (var8_35.cfr_renamed_8113() <= 0 || var7_27 >= var3_3.cfr_renamed_84() || sprenh.cfr_renamed_3.equals(var3_3.cfr_renamed_85(var7_27))) ** GOTO lbl27
                    v1 = var6_18 = true;
                    ** GOTO lbl30
lbl27:
                    // 1 sources

                    v0 = ++var7_27;
                }
                v1 = var6_18;
lbl30:
                // 3 sources

                if (v1) {
                    var5_7 |= spridh.cfr_renamed_2[var4_5];
                }
                --var4_5;
lbl33:
                // 2 sources

                v2 = var7_27 = 0;
                while (v2 < arg1.cfr_renamed_8112().size()) {
                    var8_35 = arg1.cfr_renamed_8112().get(var7_27);
                    if (var8_35.cfr_renamed_8109() == sprvhh.cfr_renamed_1) ** GOTO lbl64
                    if (var8_35.cfr_renamed_8113() <= 0) ** GOTO lbl40
                    v3 = var4_5;
                    ** GOTO lbl67
lbl40:
                    // 1 sources

                    var8_35 = sprvlh.cfr_renamed_8114(var8_35, arg1);
                    if (arg1.cfr_renamed_8115() != null) {
                        var8_35 = arg1.cfr_renamed_8115().cfr_renamed_8103(new sprbmh(var3_3));
                        var8_35 = sprvlh.cfr_renamed_8114(var8_35, arg1);
                    }
                    if (var4_5 < 0) {
                        this.cfr_renamed_3.write(var5_7);
                        var4_5 = 7;
                        var5_7 = 0;
                    }
                    var9_40 = var3_3.cfr_renamed_85(var7_27);
                    if (var8_35.cfr_renamed_4567() && var9_40 instanceof sprenh) {
                        throw new IllegalStateException(sprjgba.cfr_renamed_9("|qnvsg=`xbhvspx3x\u007fx~x}i3i{|g=zn3ovlftaxw=qd3rvo3yv{zszizr}"));
                    }
                    if (!var8_35.cfr_renamed_4567()) {
                        var10_44 = var3_3.cfr_renamed_85(var7_27);
                        if (var8_35.cfr_renamed_8116() != null) {
                            if (var10_44 instanceof sprenh) {
                                if (((sprenh)var10_44).cfr_renamed_8117() && !((sprenh)var10_44).cfr_renamed_1397().equals(var8_35.cfr_renamed_8116())) {
                                    var5_7 |= spridh.cfr_renamed_2[var4_5];
                                }
                            } else if (!var8_35.cfr_renamed_8116().equals(var10_44)) {
                                var5_7 |= spridh.cfr_renamed_2[var4_5];
                            }
                        } else if (var9_40 != sprenh.cfr_renamed_3) {
                            var5_7 |= spridh.cfr_renamed_2[var4_5];
                        }
                        --var4_5;
                    }
lbl64:
                    // 4 sources

                    v2 = ++var7_27;
                }
                v3 = var4_5;
lbl67:
                // 2 sources

                if (v3 != 7) {
                    this.cfr_renamed_3.write(var5_7);
                }
                var7_28 = arg1.cfr_renamed_8112();
                v4 = var8_36 = 0;
                while (v4 < var7_28.size()) {
                    var9_40 = arg1.cfr_renamed_8112().get(var8_36);
                    if (var9_40.cfr_renamed_8109() == sprvhh.cfr_renamed_1) ** GOTO lbl82
                    if (var9_40.cfr_renamed_8113() <= 0) ** GOTO lbl77
                    v5 = var6_18;
                    ** GOTO lbl85
lbl77:
                    // 1 sources

                    var10_44 = var3_3.cfr_renamed_85(var8_36);
                    if (var9_40.cfr_renamed_8115() != null) {
                        var9_40 = var9_40.cfr_renamed_8115().cfr_renamed_8103(new sprbmh(var3_3));
                    }
                    if (var9_40.cfr_renamed_8116() == null || !var9_40.cfr_renamed_8116().equals(var10_44)) {
                        this.cfr_renamed_8106((sprco)var10_44, (sprvlh)var9_40);
                    }
lbl82:
                    // 4 sources

                    v4 = ++var8_36;
                }
                v5 = var6_18;
lbl85:
                // 2 sources

                if (v5) {
                    var9_41 = var8_36;
                    var10_44 = new ByteArrayOutputStream();
                    var4_5 = 7;
                    var5_7 = 0;
                    v6 = var11_46 = var9_41;
                    while (v6 < var7_28.size()) {
                        if (var4_5 < 0) {
                            var10_44.write(var5_7);
                            var4_5 = 7;
                            var5_7 = 0;
                        }
                        if (var11_46 < var3_3.cfr_renamed_84() && !sprenh.cfr_renamed_3.equals(var3_3.cfr_renamed_85(var11_46))) {
                            var5_7 |= spridh.cfr_renamed_2[var4_5];
                        }
                        --var4_5;
                        v6 = ++var11_46;
                    }
                    if (var4_5 != 7) {
                        var10_44.write(var5_7);
                    }
                    this.cfr_renamed_8107(var10_44.size() + 1);
                    if (var4_5 == 7) {
                        v7 = this;
                        v8 = v7;
                        v7.write(0);
                    } else {
                        v9 = this;
                        v8 = v9;
                        v9.write(var4_5 + 1);
                    }
                    v8.write(var10_44.toByteArray());
                    v10 = var8_36;
                    while (v10 < var7_28.size()) {
                        if (var8_36 < var3_3.cfr_renamed_84() && !sprenh.cfr_renamed_3.equals(var3_3.cfr_renamed_85(var8_36))) {
                            this.cfr_renamed_8105(var3_3.cfr_renamed_85(var8_36), var7_28.get(var8_36));
                        }
                        v10 = ++var8_36;
                    }
                }
                this.cfr_renamed_3.flush();
                this.cfr_renamed_8104(arg1.cfr_renamed_8118(""));
                return;
            }
            case 3: {
                v11 = arg0;
                if (arg0 instanceof spridn) {
                    var3_4 = ((spridn)v11).cfr_renamed_329();
                    this.cfr_renamed_8108(((spridn)arg0).cfr_renamed_84());
                    v12 = arg1;
                } else if (v11 instanceof sprszm) {
                    var3_4 = ((sprszm)arg0).cfr_renamed_329();
                    this.cfr_renamed_8108(((sprszm)arg0).cfr_renamed_84());
                    v12 = arg1;
                } else {
                    throw new IllegalStateException(sprxll.cfr_renamed_9("1>7?016<1p5$t6;\"t\u0003\u0011\u0001\u000b\u001f\u0012p=#t>;$t1t3;> 1=>1\""));
                }
                var4_6 = sprvlh.cfr_renamed_8114(v12.cfr_renamed_8119(), arg1);
                v13 = var3_4;
                while (v13.hasMoreElements()) {
                    var5_8 = var3_4.nextElement();
                    this.cfr_renamed_8106((sprco)var5_8, var4_6);
                    v13 = var3_4;
                }
                this.cfr_renamed_3.flush();
                this.cfr_renamed_8104(arg1.cfr_renamed_8118(""));
                return;
            }
            case 4: {
                var5_9 = arg0.cfr_renamed_119();
                var6_19 = new sprpfh();
                var8_37 = null;
                if (!(var5_9 instanceof sprnvm)) {
                    throw new IllegalStateException(sprjgba.cfr_renamed_9("|s\u007fd3nfmcrai3irztxw=|\u007fyxpi`"));
                }
                var9_42 = (sprnvm)var5_9;
                var10_45 = var9_42.cfr_renamed_8120();
                var6_19.cfr_renamed_8121(var10_45 & 128).cfr_renamed_8121(var10_45 & 64);
                v14 = var9_42;
                var7_29 = v14.cfr_renamed_312();
                var8_37 = v14.cfr_renamed_8122().cfr_renamed_119();
                if (var7_29 <= 63) {
                    v15 = this;
                    var6_19.cfr_renamed_8123(var7_29, 6);
                } else {
                    var6_19.cfr_renamed_8123(255L, 6);
                    var6_19.cfr_renamed_8124(var7_29);
                    v15 = this;
                }
                if (v15.cfr_renamed_4 == null || !(var5_9 instanceof sprnvm)) ** GOTO lbl174
                var9_42 = (sprnvm)var5_9;
                if (64 == var9_42.cfr_renamed_8120()) {
                    v16 = var6_19;
                    this.cfr_renamed_8104(arg1.cfr_renamed_8118(sprxll.cfr_renamed_9("\u0015\u0003")));
                } else {
                    this.cfr_renamed_8104(arg1.cfr_renamed_8118(sprjgba.cfr_renamed_9("^@")));
lbl174:
                    // 2 sources

                    v16 = var6_19;
                }
                v16.cfr_renamed_8125(this.cfr_renamed_3);
                var9_42 = arg1.cfr_renamed_8112().get(var7_29);
                var9_42 = sprvlh.cfr_renamed_8114((sprvlh)var9_42, arg1);
                v17 = this;
                if (var9_42.cfr_renamed_8113() > 0) {
                    v17.cfr_renamed_8105(var8_37, (sprvlh)var9_42);
                    v18 = this;
                } else {
                    v17.cfr_renamed_8106(var8_37, (sprvlh)var9_42);
                    v18 = this;
                }
                v18.cfr_renamed_3.flush();
                return;
            }
            case 5: {
                v19 = arg0;
                if (arg0 instanceof sprktm) {
                    var5_10 = sprktm.cfr_renamed_23(v19).cfr_renamed_97();
                    v20 = arg1;
                } else {
                    var5_10 = sprqvg.cfr_renamed_23(v19).cfr_renamed_97();
                    v20 = arg1;
                }
                for (sprvlh var7_30 : v20.cfr_renamed_8112()) {
                    if (!(var7_30 = sprvlh.cfr_renamed_8114(var7_30, arg1)).cfr_renamed_8126().equals(var5_10)) continue;
                    if (var5_10.compareTo(BigInteger.valueOf(127L)) > 0) {
                        var8_38 = var5_10.toByteArray();
                        var9_43 = 128 | var8_38.length & 255;
                        v21 = this;
                        v22 = v21;
                        v21.cfr_renamed_3.write(var9_43);
                        v21.cfr_renamed_3.write(var8_38);
                    } else {
                        v23 = this;
                        v22 = v23;
                        v23.cfr_renamed_3.write(var5_10.intValue() & 127);
                    }
                    v22.cfr_renamed_3.flush();
                    v24 = arg1;
                    this.cfr_renamed_8104(v24.cfr_renamed_8118(v24.cfr_renamed_8127()));
                    return;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprxll.cfr_renamed_9("5:%9p\"18%1p")).append(var5_10).append(" ").append(sprfqe.cfr_renamed_503(var5_10.toByteArray())).append(sprjgba.cfr_renamed_9("3s|=zs3yv{zsvy3~{t\u007fy3qzng")).toString());
            }
            case 6: {
                var5_11 = sprktm.cfr_renamed_23(arg0);
                var6_21 = arg1.cfr_renamed_8128();
                if (var6_21 <= 0) ** GOTO lbl227
                var7_31 = sprhdf.cfr_renamed_512(var6_21, var5_11.cfr_renamed_97());
                switch (var6_21) {
                    case 1: 
                    case 2: 
                    case 4: 
                    case 8: {
                        while (false) {
                        }
                        this.cfr_renamed_3.write(var7_31);
                        ** GOTO lbl265
                    }
                    default: {
                        throw new IllegalStateException(new StringBuilder().insert(0, sprxll.cfr_renamed_9("!>?>;':p!9:$t<1>3$<p")).append(var6_21).toString());
                    }
                }
lbl227:
                // 1 sources

                if (var6_21 >= 0) ** GOTO lbl256
                var8_39 = var5_11.cfr_renamed_97();
                switch (var6_21) {
                    case -1: {
                        v25 = new byte[1];
                        v25[0] = sprhdf.cfr_renamed_5227(var8_39);
                        var7_32 = v25;
                        v26 = this;
                        break;
                    }
                    case -2: {
                        var7_32 = sprpxe.cfr_renamed_5178(sprhdf.cfr_renamed_5228(var8_39));
                        v26 = this;
                        break;
                    }
                    case -4: {
                        var7_32 = sprpxe.cfr_renamed_453(sprhdf.cfr_renamed_5225(var8_39));
                        v26 = this;
                        break;
                    }
lbl246:
                    // 2 sources

                    case -8: {
                        if (false) ** GOTO lbl246
                        var7_32 = sprpxe.cfr_renamed_451(sprhdf.cfr_renamed_5226(var8_39));
                        v26 = this;
                        break;
                    }
                    default: {
                        throw new IllegalStateException(sprjgba.cfr_renamed_9("h}v}rds3idr`=pr~m\u007ft~x}i3qvsti{"));
                    }
                }
                v26.cfr_renamed_3.write(var7_32);
                v27 = this;
                ** GOTO lbl266
lbl256:
                // 1 sources

                v28 = var5_11;
                if (arg1.cfr_renamed_8129()) {
                    var7_33 = sprhdf.cfr_renamed_514(v28.cfr_renamed_97());
                    v29 = this;
                } else {
                    var7_33 = v28.cfr_renamed_97().toByteArray();
                    v29 = this;
                }
                v29.cfr_renamed_8107(var7_33.length);
                this.cfr_renamed_3.write(var7_33);
lbl265:
                // 2 sources

                v27 = this;
lbl266:
                // 2 sources

                v30 = arg1;
                v27.cfr_renamed_8104(v30.cfr_renamed_8118(v30.cfr_renamed_8127()));
                this.cfr_renamed_3.flush();
                return;
            }
            case 7: {
                var5_12 = sproug.cfr_renamed_23(arg0);
                var6_22 = var5_12.cfr_renamed_186();
                v31 = this;
                if (arg1.cfr_renamed_8130()) {
                    v31.cfr_renamed_3.write(var6_22);
                    v32 = this;
                } else {
                    v31.cfr_renamed_8107(var6_22.length);
                    v33 = this;
                    v32 = v33;
                    v33.cfr_renamed_3.write(var6_22);
                }
                v34 = arg1;
                v32.cfr_renamed_8104(v34.cfr_renamed_8118(v34.cfr_renamed_8127()));
                this.cfr_renamed_3.flush();
                return;
            }
            case 8: {
                var5_13 = sprupm.cfr_renamed_23(arg0);
                var6_23 = var5_13.cfr_renamed_186();
                if (arg1.cfr_renamed_8130() && arg1.cfr_renamed_8131().intValue() != var6_23.length) {
                    throw new IOException(new StringBuilder().insert(0, sprxll.cfr_renamed_9("\u0019\u0015e\u0007$&9:7t# \"=>3p85:7 8t4;5'p:? p1!!18p057<5\"14t6=(14t<1>3$<p")).append(var6_23.length).append(" ").append(arg1.cfr_renamed_8131()).toString());
                }
                v35 = this;
                if (arg1.cfr_renamed_8130()) {
                    v35.cfr_renamed_3.write(var6_23);
                    v36 = this;
                } else {
                    v35.cfr_renamed_8107(var6_23.length);
                    v37 = this;
                    v36 = v37;
                    v37.cfr_renamed_3.write(var6_23);
                }
                v36.cfr_renamed_8104(arg1.cfr_renamed_8118(""));
                this.cfr_renamed_3.flush();
                return;
            }
            case 9: {
                var5_14 = sprkgn.cfr_renamed_23(arg0);
                var6_24 = sprkoe.cfr_renamed_431(var5_14.cfr_renamed_314());
                this.cfr_renamed_8107(var6_24.length);
                v38 = this;
                v38.cfr_renamed_3.write(var6_24);
                v38.cfr_renamed_8104(arg1.cfr_renamed_8118(""));
                v38.cfr_renamed_3.flush();
                return;
            }
            case 10: {
                var5_15 = sprgbf.cfr_renamed_23(arg0);
                var6_25 = var5_15.cfr_renamed_81();
                if (arg1.cfr_renamed_8130()) {
                    v39 = arg1;
                    v40 = this;
                    v41 = v40;
                    v40.cfr_renamed_3.write(var6_25);
                    v40.cfr_renamed_8104(v39.cfr_renamed_8118(v39.cfr_renamed_8127()));
                } else {
                    var7_34 = var5_15.cfr_renamed_106();
                    this.cfr_renamed_8107(var6_25.length + 1);
                    v42 = arg1;
                    v43 = this;
                    v41 = v43;
                    this.cfr_renamed_3.write(var7_34);
                    v43.cfr_renamed_3.write(var6_25);
                    v43.cfr_renamed_8104(v42.cfr_renamed_8118(v42.cfr_renamed_8127()));
                }
                v41.cfr_renamed_3.flush();
                return;
            }
            case 11: {
                return;
            }
            case 12: {
                var5_16 = sproug.cfr_renamed_23(arg0);
                var6_26 = var5_16.cfr_renamed_186();
                v44 = this;
                if (arg1.cfr_renamed_8130()) {
                    v44.cfr_renamed_3.write(var6_26);
                    v45 = this;
                } else {
                    v44.cfr_renamed_8107(var6_26.length);
                    v46 = this;
                    v45 = v46;
                    v46.cfr_renamed_3.write(var6_26);
                }
                v47 = arg1;
                v45.cfr_renamed_8104(v47.cfr_renamed_8118(v47.cfr_renamed_8127()));
                this.cfr_renamed_3.flush();
                return;
            }
            case 13: {
                return;
            }
            case 14: {
                this.cfr_renamed_8104(arg1.cfr_renamed_8132());
                var5_17 = sprbxm.cfr_renamed_23(arg0);
                v48 = this;
                if (var5_17.cfr_renamed_587()) {
                    v48.cfr_renamed_3.write(255);
                    v49 = this;
                } else {
                    v48.cfr_renamed_3.write(0);
                    v49 = this;
                }
                v49.cfr_renamed_3.flush();
            }
        }
    }

    public static int cfr_renamed_8133(long arg0) {
        int n;
        long l = -72057594037927936L;
        int n2 = n = 8;
        while (n2 > 0 && (arg0 & l) == 0L) {
            arg0 <<= 8;
            n2 = --n;
        }
        return n;
    }
}

