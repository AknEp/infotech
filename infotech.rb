class Infotech
	[:saru, :tori, :inu].each do |name|
		define_method(name) {
			return "my name is #{name}"
		}
	end
end

#main
it = Infotech.new
puts it.saru, it.tori, it.inu