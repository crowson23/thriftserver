package com.allyes.dcdb.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;

import dc.thrift.generated.GetResponseDeliverInfo;
import dc.thrift.generated.GetResponseQuota;
import dc.thrift.generated.RequestDeliverInfo;
import dc.thrift.generated.RequestQuota;
import dc.thrift.generated.ResponseDeliverInfo;
import dc.thrift.generated.ResponseQuota;
import dc.thrift.generated.Status;
import com.facebook.fb303.fb_status;


public class DcImpl implements dc.thrift.generated.DcDbService.Iface {

	public DcImpl() {
	}

	@Override
	public GetResponseDeliverInfo sendDeliverInfoList(List<RequestDeliverInfo> requestDeliverInfoList, long ip,
			String dbName) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetResponseQuota sendRequestQuotaList(List<RequestQuota> requestQuotaList, long ip, String dbName)
			throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	
/*
	public List<GetResponseDeliverInfo> sendDeliverInfoList(List<RequestDeliverInfo> requestDeliverInfoList, long ip,
			String dbName) throws TException {
		System.out.println("dbName-->"+dbName);
		System.out.println("ip-->"+Utils.longToIp(ip));
		List<GetResponseDeliverInfo> resultList = new ArrayList<GetResponseDeliverInfo>();
		ResponseDeliverInfo rdi = new ResponseDeliverInfo();
		for(int i=0;i<requestDeliverInfoList.size();i++){
			rdi = new ResponseDeliverInfo();
			rdi.setBidCount((i+1));
			rdi.setClick((i+1));
			rdi.setImpression((i+1));
			rdi.setSolutionId((i+1));
			rdi.setUpdateTime(System.currentTimeMillis()/1000);
			resultList.add(new GetResponseDeliverInfo(Status.OK , rdi));
			rdi = null;
		}
		return resultList;
	}

	public List<GetResponseQuota> sendRequestQuotaList(List<RequestQuota> requestQuotaList, long ip, String dbName)
			throws TException {
		List<GetResponseQuota> resultList = new ArrayList<GetResponseQuota>();
		ResponseQuota rq = new ResponseQuota();
		for(int i=0;i<requestQuotaList.size();i++){
			rq = new ResponseQuota();
			rq.setQuota((i+1));
			rq.setSolutionId((i+1));
			rq.setUpdateTime(System.currentTimeMillis()/1000);
			resultList.add(new GetResponseQuota(Status.OK , rq));
			rq = null;
		}
		return resultList;
	}
*/
	

	

}