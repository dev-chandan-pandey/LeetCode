/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
          let int_arr = [];
    let r = 0;
    let sum = 0;
    let flg = 1;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === "M") {
            if (s[i + 1] === "M" || s[i + 1] === "M") {

            }
            else {
                if (s[i - 1] === "C") {
                    int_arr[r] = 900;
                    r++;
                } else if (s[i - 1] === "M") {
                    if (s[i - 2] === "M") {
                        int_arr[r] = 3000;
                        r++;
                    } else {
                        int_arr[r] = 2000;
                        r++;
                    }
                } else {
                    int_arr[r] = 1000;
                    r++;
                }
            }

        }
        if (s[i] === "D") {
            if (s[i - 1] === "C") {
                int_arr[r] = 400;
                r++;
            } else {
                int_arr[r] = 500;
                r++;
            }
        }
        if (s[i] === "C") {
            if (s[i + 1] === "M" || s[i + 1] === "D"||s[i+1]==="C") {
            }
            else {
                if (s[i - 1] === "X") {
                    int_arr[r] = 90;
                    r++;
                } else if (s[i - 1] === "C") {
                    if (s[i - 2] === "C") {
                        int_arr[r] = 300;
                        r++;
                    } else {
                        int_arr[r] = 200;
                        r++;
                    }
                }
                else {
                    int_arr[r] = 100;
                    r++;
                }
            }
        }
        if (s[i] === "L") {
            if (s[i - 1] === "X") {
                int_arr[r] = 40;
                r++;
            } else {
                int_arr[r] = 50;
                r++;
            }
        }
        if (s[i] === "X") {
            if (s[i + 1] === "C" || s[i + 1] === "L") {

            }
            else {
                if (s[i - 1] === "I") {
                    int_arr[r] = 9;
                    r++;
                } else if (s[i - 1] === "I") {
                    if (s[i - 2] === "I") {
                        int_arr[r] = 30;
                        r++;
                    } else {
                        int_arr[r] = 20;
                        r++;
                    }
                } else {
                    int_arr[r] = 10;
                    r++;
                }
            }

        }


        if (s[i] === "V") {
            if (s[i - 1] === "I") {
                int_arr[r] = 4;
                r++;
            } else {
                int_arr[r] = 5;
                r++;
            }
        }
        if (s[i] === "I" && flg === 1) {
            if (s[i + 1] === "X" || s[i + 1] === "V") {

            }
            else {
                if (s[i + 1] === "I") {
                    if (s[i + 2] === "I") {
                        int_arr[r] = 3;
                        r++;
                    } else {
                        int_arr[r] = 2;
                        r++;
                    }
                } else {
                    int_arr[r] = 1;
                    r++;
                }
                flg = 0;
            }

        }

    }
    for (let j = 0; j < r; j++) {
        sum = sum + int_arr[j];
    }
    return sum;
};