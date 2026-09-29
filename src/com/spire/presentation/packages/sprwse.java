/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjle;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwry;
import com.spire.presentation.packages.sprzgn;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprwse {
    public static final Hashtable cfr_renamed_91;
    public static final Hashtable cfr_renamed_0;
    private static sprjle cfr_renamed_1;
    public static final Hashtable cfr_renamed_2;
    private static sprjle cfr_renamed_3;
    private static sprjle cfr_renamed_4;

    static {
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_0 = new Hashtable();
        cfr_renamed_91 = new Hashtable();
        cfr_renamed_4 = new sprjle(1024, new BigInteger(sprwry.cfr_renamed_9("\fs\nq\u000fp\u000fu\u0005s\u0005y\u0004r\u000fu\fv\tw\bx\rv\ru\u000fv\nv\fv\u000bu\tr\bs\bv\u0005v\u000bt\u000et\ry\u0004p\u000bt\u000et\u0005p\u000fy\fv\bq\ns\u000bt\nq\bq\u000ep\u000fw\rx\u0005t\rx\u0005u\u0004v\ts\u000ep\u0005y\u000er\u000eu\u0005r\tq\fp\u0005q\u0004s\bx\u0004x\u0004x\bp\u000fq\u0004y\u0005x\u000eu\fr\rw\bx\u000fq\bw\fu\u0004x\u000bv\u000fu\u000ft\tp\u000fp\ru\u0004s\nu\u000eu\u0004r\bv\rv\tx\u000fq\u000ep\u000fv\u000bx\bw\fu\bp\u000by\u0004s\u000fu\fp\rt\nx\u000ep\fs\ty\u0005p\u000fw\fq\u000fs\u0004w\ny\br\tw\u000ey\tq\fw\u0004r\bs\rq\fr\u000fy\u0005x\u0004t\rq\rr\u000bs\u000fw\rw\u0005u\u000fs\u000fv\bq\u0005p\u000et\u000es\u000eq\nq\ru\bp\nr\tp\u000br\u000ew\u0005t\rq\tt\tp\rw\u000ft\u0005w\u0004v\fu\fw\u0005y\u000ew\u0005w\nv\u0005y\ts\br\ny\u000fq\u000ey\u000e")), new BigInteger(sprzgn.cfr_renamed_9("9\u0001<\u000f<\b6\u000f>\r;\u0000:\f8\t?\u000e7\r;\r;\b9\f9\b>\u0001=\u000e=\f=\u00016\f>\t=\b8\t7\u00017\u000e9\b;\r=\t:\f?\u0000:\t:\b=\u00018\f:\t<\b;\t7\n?\u000b<")), new BigInteger(sprwry.cfr_renamed_9("\fq\rx\u0004v\u0004q\u000bv\bt\rt\br\ru\nv\u000fq\u0005p\u0005p\bt\u000et\u0004s\bs\u000fu\u0005w\u0004y\tp\ry\u000ft\ns\rt\u000eu\bv\u0005v\ty\u000fr\bp\by\nt\bv\np\tv\u0004x\rt\u000fx\u000fv\u000fv\nv\u000fu\tp\bs\u0005t\u000fw\u0004x\u000fx\u0005v\u0004w\ty\u000er\bw\u000bx\u0004w\u0005s\u0005u\u000fq\u000fv\u0004v\u000fy\u0004w\rt\u000fv\tv\fv\u000ep\nt\ty\rt\u0004q\ty\bw\rv\fr\tv\tw\u0005t\u000fp\tp\u0004s\u0005w\u0005q\u0004p\u000ft\u000bp\bq\u000fy\rs\u000fs\u000fp\u0005t\u000bu\nt\u000ex\fx\rx\rs\u000bt\u000bp\fw\u000ew\ny\tv\u000fv\rp\tt\rp\u0004q\u000bw\nx\ts\u0004q\u0004r\rp\u0005t\tu\u000bs\fw\u000ex\u0004v\u000eq\u0005v\u000fs\u000fp\nr\u000fy\u0005x\u0005r\rr\u000fr\fx\tq\u0004v\u000et\bu\rr\u000fp\u000eu\rq\u0004v\u000ft\u0005y\u000es\u000fy\nw\u0005t\rx\tw\nu\rw\u000br\u0004w\u000f")));
        cfr_renamed_3 = new sprjle(1024, new BigInteger(sprzgn.cfr_renamed_9(">\n6\r:\r7\u000e>\b6\u0000>\b:\u0001=\f9\t>\r?\u00009\f:\b?\u000e9\u0000?\u000e>\n>\t8\t;\b8\t8\t:\u00006\u000b7\t<\b8\u00008\u000e:\u0001?\t>\r:\r<\u000e:\u000e9\f<\f8\u000e=\u000b6\u0001;\t6\r>\u000b;\n9\u0001:\u000b=\u000b7\u0001=\n6\u0001<\n?\n6\b>\r9\u0001>\u000f;\u0001?\u000e9\u000f7\u0001=\n9\u0000=\b=\u000b?\u000e<\u000e<\u000b=\u000f8\u000b>\u000f?\u000e;\t8\r8\u000e8\b8\t?\u0000>\b>\n;\f:\t;\n=\t:\n7\t;\u000f;\u000e9\u0000;\u0000?\r9\u00019\b=\t>\b<\t7\u000e7\b9\u000b;\t8\r?\b7\r7\t?\r8\u000e?\r8\b:\u000e<\n9\u000f9\u000b6\u000b9\u000b;\u0000;\u000b<\f8\b=\r7\u0001=\n6\u000f7\f;\u000b=\u000b>\u000e:\n9\u000f?\b;\n<\u0000>\r7\f9\u0001?\u0001;\t:\u000b?\n<\u000f7\f6\r:\u0001;\u0000;\u0001?\n>\u00018\n;\b=\u00017\f7\t;\u00016\f=\f>\u000f<")), new BigInteger(sprwry.cfr_renamed_9("\nx\u0005y\bp\tp\u000bw\u000eu\fq\u0004v\u000by\u0004v\u000bs\np\fy\u0004r\bv\bw\u000es\u000ev\tv\u000eq\nx\bp\u0004p\u000bt\rv\u000br\u0004v\by\u000eq\ru\ns\u000bx\u000fr\u000ey\u0005v\u000et\u000er\u0004t\u0004")), new BigInteger(sprzgn.cfr_renamed_9("\r=\u0000;\b7\u000b9\b;\u00019\b:\u0001?\r>\r<\u00018\n;\r8\u000e<\u000e6\f:\f?\u000b<\u0000=\u000f8\u000b<\r:\u00009\u00019\t8\b;\n?\u000f9\u000e6\u0001>\b=\u00006\r?\u00016\r8\b=\n>\r=\t?\u000b8\t9\t<\u0001:\u000b>\u000f9\u00006\f9\n7\r7\u000e>\u00006\f8\u000f:\u000e=\u0001;\u0001>\r7\u00007\u0000?\u00008\u000e?\u000e:\u0000;\u000f=\u000f>\n;\n8\u000f9\u0000;\f9\n9\r7\u0001=\u000e<\t<\u000e?\u0001<\u00016\n;\u000e6\b?\u0001?\u0001<\f6\n=\u000f;\u000e6\u000e9\u000e8\u00019\t>\u0000>\f<\r<\r8\r;\t?\u00009\b?\n;\u000b<\b<\b9\u000f8\u000b:\u000e7\u000f7\u000f6\u000b?\r7\u000b>\u0000;\u0000<\u000b7\u000e7\u000f<\n<\u000f?\u000b?\n<\u0001;\u000e6\u000e?\u0000=\u000f7\r<\r=\u000b;\u000e9\u000b>\t:\f8\u000f?\u000b<\f?\b9\b<\u000b9\b;\u000e7\t9\f=\u000e9\b?\u000b7\f?\u0000;\r:\r?\n<\n7\u000f:\u000b<\r>")));
        cfr_renamed_1 = new sprjle(1024, new BigInteger(sprwry.cfr_renamed_9("\fu\u000fq\fp\nu\ft\u0004v\bw\u000eu\u0005p\fx\u000br\u000by\u000fy\u000bq\u000fs\u000ep\u0005q\u0005x\nu\u000es\nw\fr\u0005r\u0004t\u000fu\u000ev\u000ey\nw\u000fy\ns\bv\u000eu\tp\u0004s\nu\bx\u000ex\u000et\fs\np\u0005x\nr\u000br\fp\u000bw\rv\u0005u\u000bv\u000bq\rr\u000bq\u0005u\u0005x\tw\u000bs\u000et\u000bv\u000bs\bv\u0004t\u000fy\u000fv\nu\np\u0004s\fs\u000fu\fx\u000fx\rv\fq\tw\fr\ts\ry\u000ey\rw\u000ew\u000ex\tq\u0005u\bp\u000fw\u0004p\u0005s\u0005y\u0004u\rq\rt\np\bs\tw\u000ft\tu\bs\u0004t\nw\u0004r\tx\u000et\u000bv\bs\ns\u0005x\bw\u0005r\ft\tp\nv\bu\tp\nw\u000ep\u000ex\u000ey\tu\bv\fx\fv\bt\rx\u000by\tv\fq\ny\tw\bx\bw\u000bs\bu\nx\ts\u000ep\u000fs\u0004r\u000er\u0005u\u0005r\u0004s\tt\fu\u000er\u0004w\fu\ns\nv\u000bq\u000by\fy\u0005q\u000bq\u0004v\u000eu\u000fr\u0004")), new BigInteger(sprzgn.cfr_renamed_9("6\b8\u000e>\f=\u00007\u00009\f:\r9\t:\u0000;\f:\u00017\b;\u0000?\b7\n7\u000b8\f?\u000b>\u000e=\u00009\u0001:\u0001<\u0000<\f=\t8\u000b;\b8\u000b8\r<\n=\f8\u000b:\r8\r<\u000e;\u00008\u00007\t>")), new BigInteger(sprwry.cfr_renamed_9("\fr\u000et\u000ep\u0005p\u000es\ns\ns\rw\nr\tr\u000ey\bx\bp\u0004x\ty\u000ep\u0004q\rp\u000fp\nx\ts\u000ev\bx\u000bv\u0005u\nu\u0005w\u0005x\u0004u\u0005s\u000et\u0004t\u0004x\u000ew\u0004w\ts\bs\u0005v\u000eu\np\u000fu\u000bp\bx\ru\rr\u000es\nv\u000ep\u0005s\fu\fq\u000es\u0005q\fs\bs\u0004s\br\u0005v\fx\fu\ny\u0005t\u0004y\u0004x\u000ep\rr\u000ep\rt\u000bv\nu\tp\u000ew\fx\u000br\u000bu\u0005q\u000eq\u000bu\ns\fr\nv\u0005s\u000bw\bw\u0005x\u0005w\u0005w\tw\u0005u\u000br\u000fv\nv\fq\ft\ry\rx\tq\fp\u0005s\u000bq\u0005v\nq\u000fq\fw\ft\u000es\tx\u0004q\tw\u0005r\u000es\u0004r\fs\u0004u\u0004s\rx\fs\nv\u000bs\tp\fr\ny\ny\rr\rs\u000fu\u000et\bv\tw\u000bq\u000bs\u0005r\u0004v\fw\bx\u000ev\u000bu\u000fw\u0005r\u000fw\nu\u000fw\u0004v\u0005q\u0005y\rq\u000bp\u000br\ft\u000fy\fw\u000eu\nt\u0005y\n")));
        cfr_renamed_0.put(sprji.cfr_renamed_93, cfr_renamed_4);
        cfr_renamed_0.put(sprji.cfr_renamed_96, cfr_renamed_3);
        cfr_renamed_0.put(sprji.cfr_renamed_119, cfr_renamed_1);
        cfr_renamed_2.put(sprzgn.cfr_renamed_9("~`J{k<\r>\t\"\u0000;\u0014LKvI{V_K`\u0014N"), sprji.cfr_renamed_93);
        cfr_renamed_2.put(sprwry.cfr_renamed_9("\u0006R2I\u0013\u000eu\fq\u0010x\tl~3D1I.m3Rl\u007f"), sprji.cfr_renamed_96);
        cfr_renamed_2.put(sprzgn.cfr_renamed_9("HV|M]\n;\b?\u00146\r\"z}@\u007fM`i}V\"alQN"), sprji.cfr_renamed_119);
    }

    public static sprtzd cfr_renamed_2103(String arg0) {
        return (sprtzd)cfr_renamed_2.get(arg0);
    }

    public static sprjle cfr_renamed_2102(sprtzd arg0) {
        return (sprjle)cfr_renamed_0.get(arg0);
    }

    public static sprjle cfr_renamed_1837(String arg0) {
        sprtzd sprtzd2 = (sprtzd)cfr_renamed_2.get(arg0);
        if (sprtzd2 != null) {
            return (sprjle)cfr_renamed_0.get(sprtzd2);
        }
        return null;
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_2.keys();
    }
}

