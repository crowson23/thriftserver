/*  Copyright (c) 2013-2014 Allyes */

include "fb303.thrift"

namespace cpp dcdb.thrift
namespace java com.allyes.dcdb.thrift.generated
namespace py dcdb


enum MsgType {
    DELIVER_INFO = 0;
    ASK_QUOTA = 1;
}

struct MsgData {
    1:  i64 action = 0;
    2:  i64 bidden = 0;
	3:  i64 bidCount = 0;
	4:  i64 impression = 0;
	5:  i64 click = 0;
	6:  i64 quota = 0;
	7:  i64 spending = 0;
	8:  i64 totalBidCount = 0;
	9:  i64 totalImpression = 0;
	10: i64 totalClick = 0;
	11: i64 totalSpending = 0;
	12: i64 solutionId = 0;
	13: i64 quotaUpdateTime = 0;
}


struct RecvMessageResult {
	1: i32 totalLen = 0;
	2: MsgType msgType;
	3: MsgData msgData;
}

service DcDb extends fb303.FacebookService
{
    /* 
     send msg to dc server
     */
    RecvMessageResult sendMsg(1:MsgType msgType, 2:MsgData msgData);

}

