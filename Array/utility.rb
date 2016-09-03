def get_cumulative_sum(dataset)
    data_array = []
    if dataset.present?
      value = 0
      prev_day = -1
      for index in 0..dataset.length-1
        curr_day = dataset[index]["day"]
        if prev_day != curr_day && prev_day >= 0
          data = {
            label: dataset[index]["label"],
            day: prev_day,
            cum_count: value,
            count: dataset[index]["count"]
          }
          data_array << data
        end
        value = value + dataset[index]["count"]
        prev_day = curr_day
      end
      data = {
        label: dataset.last["label"],
        day: prev_day,
        cum_count: value,
        count: dataset.last["count"]
      }
      data_array << data
    end
    return data_array
  end

  def get_days_in_month(data)
    if data["month"].in? [1, 3, 5, 7, 8, 10, 12]
      return 31
    elsif data["month"].in? [3, 4, 6, 9, 11]
      return 30
    else
      return data["month"] == 2 && ((data["year"]%100 == 0 && data["year"]%400 == 0) || data["year"]%4 == 0) ? 29 : 28
    end
  end

  def filling_missing_day(dataset)
    data_array = []
    days = get_days_in_month(dataset.first)
    label = dataset.first["label"]
    k = 0
    for index in 1..days
      b.pp
      if dataset[k].present?
        day = dataset[k]["day"]
      end
      if index == day
        count = dataset[k]["count"]
        k = k+1
      else
        count = 0
      end
      data = {
          label: label,
          day: index,
          count: count
        }
        data_array << data
    end 
    return data_array
  end