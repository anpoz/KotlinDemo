package io.playcode.anpoz.kotlindemo.data.model

class PandaStreamEntity {

    /**
     * errno : 0
     * errmsg :
     * data : {"info":{"hostinfo":{"rid":31933058,"name":"Riot国际赛直播间","avatar":"http://i6.pdim.gs/a258e7db1d9fb288c0dd4dcb8a32720a.png","bamboos":"10043301"},"roominfo":{"id":"371037","name":"MSI小组赛第五日 精彩回放","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"移动用户观看有问题的请进APP设置开启硬件解码","details":"","person_num":"62764","fans":"297429","pictures":{"img":"http://i7.pdim.gs/fbbf33ab55798ca5b15b08f52adf31ee.jpeg"},"display_type":"1","start_time":"1494627292","end_time":"1494634438","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","remind_content":"","remind_time":"0","remind_status":"0"},"userinfo":{"rid":0},"videoinfo":{"name":"dota","time":"530257","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"dd9f182bcec99d04099113e618cfc5b3","plflag":"2_3","status":"2","sign":"5f433f2489b38a05bd0a357bf6bae768","ts":"&ts=591e4b2d&rid=-16469380","hardware":2,"scheme":"http","slaveflag":["4_7","5_9","7_12"],"watermark":0}}}
     * authseq :
     */

    var errno: Int = 0
    var errmsg: String? = null
    var data: DataBean? = null
    var authseq: String? = null

    class DataBean {
        /**
         * info : {"hostinfo":{"rid":31933058,"name":"Riot国际赛直播间","avatar":"http://i6.pdim.gs/a258e7db1d9fb288c0dd4dcb8a32720a.png","bamboos":"10043301"},"roominfo":{"id":"371037","name":"MSI小组赛第五日 精彩回放","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"移动用户观看有问题的请进APP设置开启硬件解码","details":"","person_num":"62764","fans":"297429","pictures":{"img":"http://i7.pdim.gs/fbbf33ab55798ca5b15b08f52adf31ee.jpeg"},"display_type":"1","start_time":"1494627292","end_time":"1494634438","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","remind_content":"","remind_time":"0","remind_status":"0"},"userinfo":{"rid":0},"videoinfo":{"name":"dota","time":"530257","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"dd9f182bcec99d04099113e618cfc5b3","plflag":"2_3","status":"2","sign":"5f433f2489b38a05bd0a357bf6bae768","ts":"&ts=591e4b2d&rid=-16469380","hardware":2,"scheme":"http","slaveflag":["4_7","5_9","7_12"],"watermark":0}}
         */

        var info: InfoBean? = null

        class InfoBean {
            /**
             * hostinfo : {"rid":31933058,"name":"Riot国际赛直播间","avatar":"http://i6.pdim.gs/a258e7db1d9fb288c0dd4dcb8a32720a.png","bamboos":"10043301"}
             * roominfo : {"id":"371037","name":"MSI小组赛第五日 精彩回放","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"移动用户观看有问题的请进APP设置开启硬件解码","details":"","person_num":"62764","fans":"297429","pictures":{"img":"http://i7.pdim.gs/fbbf33ab55798ca5b15b08f52adf31ee.jpeg"},"display_type":"1","start_time":"1494627292","end_time":"1494634438","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","remind_content":"","remind_time":"0","remind_status":"0"}
             * userinfo : {"rid":0}
             * videoinfo : {"name":"dota","time":"530257","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"dd9f182bcec99d04099113e618cfc5b3","plflag":"2_3","status":"2","sign":"5f433f2489b38a05bd0a357bf6bae768","ts":"&ts=591e4b2d&rid=-16469380","hardware":2,"scheme":"http","slaveflag":["4_7","5_9","7_12"],"watermark":0}
             */

            var hostinfo: HostinfoBean? = null
            var roominfo: RoominfoBean? = null
            var userinfo: UserinfoBean? = null
            var videoinfo: VideoinfoBean? = null

            class HostinfoBean {
                /**
                 * rid : 31933058
                 * name : Riot国际赛直播间
                 * avatar : http://i6.pdim.gs/a258e7db1d9fb288c0dd4dcb8a32720a.png
                 * bamboos : 10043301
                 */

                var rid: Int = 0
                var name: String? = null
                var avatar: String? = null
                var bamboos: String? = null
            }

            class RoominfoBean {
                /**
                 * id : 371037
                 * name : MSI小组赛第五日 精彩回放
                 * type : 1
                 * classification : 英雄联盟
                 * cate : lol
                 * bulletin : 移动用户观看有问题的请进APP设置开启硬件解码
                 * details :
                 * person_num : 62764
                 * fans : 297429
                 * pictures : {"img":"http://i7.pdim.gs/fbbf33ab55798ca5b15b08f52adf31ee.jpeg"}
                 * display_type : 1
                 * start_time : 1494627292
                 * end_time : 1494634438
                 * room_type : 1
                 * status : 2
                 * style_type : 1
                 * banned_reason :
                 * unlock_time : 0
                 * remind_content :
                 * remind_time : 0
                 * remind_status : 0
                 */

                var id: String? = null
                var name: String? = null
                var type: String? = null
                var classification: String? = null
                var cate: String? = null
                var bulletin: String? = null
                var details: String? = null
                var person_num: String? = null
                var fans: String? = null
                var pictures: PicturesBean? = null
                var display_type: String? = null
                var start_time: String? = null
                var end_time: String? = null
                var room_type: String? = null
                var status: String? = null
                var style_type: String? = null
                var banned_reason: String? = null
                var unlock_time: String? = null
                var remind_content: String? = null
                var remind_time: String? = null
                var remind_status: String? = null

                class PicturesBean {
                    /**
                     * img : http://i7.pdim.gs/fbbf33ab55798ca5b15b08f52adf31ee.jpeg
                     */

                    var img: String? = null
                }
            }

            class UserinfoBean {
                /**
                 * rid : 0
                 */

                var rid: Int = 0
            }

            class VideoinfoBean {
                /**
                 * name : dota
                 * time : 530257
                 * stream_addr : {"HD":"1","OD":"1","SD":"1"}
                 * room_key : dd9f182bcec99d04099113e618cfc5b3
                 * plflag : 2_3
                 * status : 2
                 * sign : 5f433f2489b38a05bd0a357bf6bae768
                 * ts : &ts=591e4b2d&rid=-16469380
                 * hardware : 2
                 * scheme : http
                 * slaveflag : ["4_7","5_9","7_12"]
                 * watermark : 0
                 */

                var name: String? = null
                var time: String? = null
                var stream_addr: StreamAddrBean? = null
                var room_key: String? = null
                var plflag: String? = null
                var status: String? = null
                var sign: String? = null
                var ts: String? = null
                var hardware: Int = 0
                var scheme: String? = null
                var watermark: Int = 0
                var slaveflag: List<String>? = null

                class StreamAddrBean {
                    /**
                     * HD : 1
                     * OD : 1
                     * SD : 1
                     */

                    var hd: String? = null
                    var od: String? = null
                    var sd: String? = null
                }
            }
        }
    }
}

