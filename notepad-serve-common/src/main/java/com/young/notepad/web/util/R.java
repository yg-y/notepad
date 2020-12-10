package com.young.notepad.web.util;

import com.young.notepad.web.constants.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 响应信息主体
 *
 * @author young
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R implements Serializable {
    private static final long serialVersionUID = -5537330587033784458L;

    @Getter
    @Setter
    private int code = CommonConstants.SUCCESS;

    @Getter
    @Setter
    private String msg = "success";

    @Getter
    @Setter
    private Object data;

    public R() {
        super();
    }

    public static R SUCCESS(Object o) {
        return R.builder().build().setData(o).setMsg("success").setCode(CommonConstants.SUCCESS);
    }

    public static R ERROR(String msg) {
        return R.builder().build().setData(null).setMsg(msg).setCode(CommonConstants.FAIL);
    }

    public static R SUCCESS() {
        return R.builder().build().setData(null).setMsg("success").setCode(CommonConstants.SUCCESS);
    }

    public static R ERROR() {
        return R.builder().build().setData(null).setMsg("error").setCode(CommonConstants.FAIL);
    }


    public static R SUCCESS(Object o, String msg) {
        return R.builder().build().setData(o).setMsg(msg).setCode(CommonConstants.SUCCESS);
    }

    public static R ERROR(Object o, String msg) {
        return R.builder().build().setData(o).setMsg(msg).setCode(CommonConstants.FAIL);
    }

    public static R ERROR(Throwable e) {
        return R.builder().build().setData(null).setMsg(e.getMessage()).setCode(CommonConstants.FAIL);
    }

    public static R UNLOGIN() {
        return R.builder().build().setData(null).setMsg(CommonConstants.UNLOGIN_STR).setCode(CommonConstants.UNLOGIN);
    }
}
